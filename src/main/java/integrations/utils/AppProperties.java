package integrations.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class AppProperties {

    private static AppProperties instance = null;
    //API Key
    private String apiKey;
    //API Host
    private String apiHost;
    //API Version
    private String apiVersion;
    //Jackson Mapper
    private ObjectMapper mapper = new ObjectMapper();

    private AppProperties() {
        //Custom config for jackson mapper
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    public static AppProperties getInstance() {
        if (instance == null) {
            instance = new AppProperties();
        }
        return instance;
    }

    public String getApiKey() {
        return apiKey;
    }
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiHost() {
        return apiHost;
    }
    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    public String getApiVersion() {
        return apiVersion;
    }
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ObjectMapper getMapper() {
        return mapper;
    }
    public void setMapper(ObjectMapper mapper) {
        this.mapper = mapper;
    }
}
