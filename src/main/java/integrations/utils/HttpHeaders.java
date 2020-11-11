package integrations.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class HttpHeaders {

    private static final Logger logger = LogManager.getLogger(HttpHeaders.class);
    private AppProperties appProperties = AppProperties.getInstance();

    public Map<String, String> headers_Insightly() {
        Map<String, String> headersMap = new HashMap<String, String>();
        headersMap.put("Authorization", "Basic " + base64Header("insightly"));
        headersMap.put("Accept", "application/json; charset=utf-8");
        headersMap.put("Content", "application/json; charset=utf-8");

        return headersMap;
    }

    public Map<String, String> headers_Other() {
        Map<String, String> headersMap = new HashMap<String, String>();
        headersMap.put("Authorization", "Basic " + base64Header("some other company"));
        headersMap.put("Accept", "application/json; charset=utf-8");
        headersMap.put("Content", "application/json; charset=utf-8");

        return headersMap;
    }

    private String base64Header(String company) {

        String plainCreds = "";
        byte[] plainCredsBytes;

        if (company.equalsIgnoreCase("insightly")) {
            plainCreds = appProperties.getApiKey();
        } else if (company.equalsIgnoreCase("some other company")) {
            plainCreds = appProperties.getApiKey();
        } else {
            logger.warn("Error, company not found while creating basic auth!");
        }
        plainCredsBytes = plainCreds.getBytes();
        byte[] encodedPlainCredsBytes = Base64.getEncoder().encode(plainCredsBytes);
        return new String(encodedPlainCredsBytes);
    }
}
