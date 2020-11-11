package integrations;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.fasterxml.jackson.databind.JsonNode;

import integrations.services.RESTCalls;
import integrations.utils.AppProperties;
import integrations.utils.Responses.ObjectNodeResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//You can also implement Requesthandler instead of RequestStreamhandler if you want AWS Lambda to serialize data.
//More information can be found here -> http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html
//You can use Log4J or AWS Logger. More information can be found here -> http://docs.aws.amazon.com/lambda/latest/dg/java-logging.html
public class Insightly_Application implements RequestStreamHandler {

    //Using log4j
    private static final Logger logger = LogManager.getLogger(Insightly_Application.class);
    private final AppProperties appProperties = AppProperties.getInstance();
    private final RESTCalls apiCalls = new RESTCalls();

    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) {


        //Read env variables set in AWS Lambda for use in the app
        appProperties.setApiKey(System.getenv("insightly_apiKey"));
        appProperties.setApiHost("api.insightly.com");
        appProperties.setApiVersion("v3.1");

        try {
            //Converting inputStream into String
            JsonNode entity = appProperties.getMapper().readValue(inputStream, JsonNode.class);
            if (entity.has("insightly")) {

                long recordId = entity.get("insightly").get("recordId").asLong();
                String recordType = entity.get("insightly").get("recordType").asText();

                logger.info("RecordID: " + recordId + ". Type: " + recordType);

                fetchDetails(recordId, recordType);
            } else {
                logger.error("Invalid object");
            }
        } catch (IOException e) {
            logger.error(Arrays.toString(e.getStackTrace()));
        }

    }

    //Implement here
    private void fetchDetails(Long recordId, String recordType) {
        ObjectNodeResponse response = apiCalls.getMethod(String.valueOf(recordId), recordType);
        logger.info("Response: \t" + response.toString());
    }
}
