package integrations;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.JsonNode;
import integrations.services.RESTCalls;
import integrations.utils.AppProperties;
import integrations.utils.Responses.GatewayResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class APIGateway_Application implements RequestHandler<Object, Object> {

    private static final Logger logger = LogManager.getLogger(APIGateway_Application.class);
    private final AppProperties properties = AppProperties.getInstance();

    @Override
    public Object handleRequest(final Object input, final Context context) {

        //Read env variables set in AWS Lambda for use in the app
        properties.setApiKey(System.getenv("environment_variable"));

        // headers
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-AWS-Request-ID", context.getAwsRequestId());

        try {
            //Printing RequestObject
            logger.info("Request: " + input);

            //Tree
            JsonNode tree = properties.getMapper().readTree(String.valueOf(input));

            //API call to test api_key
            logger.info("API Gateway Input: " + tree.toString());
            logger.info("Request Payload: " + tree.get("body").asText());

            return new GatewayResponse("success", headers, 200);
        } catch (IOException e) {
            logger.error(e.getMessage());
            return new GatewayResponse(e.getMessage(), headers, 500);
        }
    }
}
