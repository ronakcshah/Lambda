package integrations;

import com.amazonaws.services.lambda.runtime.Context;

import java.io.*;

import static org.mockito.Mockito.mock;

public class Insightly_ApplicationTest {
    Insightly_Application handler = new Insightly_Application();

    File file = new File("src/test/resources/record.json");
    InputStream lambdaRequest = new FileInputStream(file);
    ByteArrayOutputStream lambdaResponse = new ByteArrayOutputStream();
    Context context = mock(Context.class);

    public Insightly_ApplicationTest() throws FileNotFoundException {
        handler.handleRequest(lambdaRequest, lambdaResponse, context);
    }

}
