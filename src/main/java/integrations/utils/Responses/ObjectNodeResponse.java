package integrations.utils.Responses;

/**
 * ObjectNode response for mapping API responses
 */
public class ObjectNodeResponse {

    private final int statusCode;
    private final String result;
    private final String response;

    public ObjectNodeResponse(String result, int statusCode, String response) {
        this.result = result;
        this.statusCode = statusCode;
        this.response = response;
    }

    public String getResult() {
        return result;
    }

    public String getResponse() {
        return response;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String toString() {
        return "Response: {" +
                "\"result\":\"" + result + "\"," +
                "\"statusCode\":" + statusCode + "," +
                "\"response\":\"" + response + "\"" +
                '}';
    }
}
