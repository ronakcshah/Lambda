package integrations.pojo.insightly.customFields;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FIELD_NAME",
        "FIELD_VALUE"
})
public class CustomField {

    @JsonProperty("FIELD_NAME")
    private String fIELDNAME;
    @JsonProperty("FIELD_VALUE")
    private Object fIELDVALUE;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FIELD_NAME")
    public String getFIELDNAME() {
        return fIELDNAME;
    }

    @JsonProperty("FIELD_NAME")
    public void setFIELDNAME(String fIELDNAME) {
        this.fIELDNAME = fIELDNAME;
    }

    @JsonProperty("FIELD_VALUE")
    public Object getFIELDVALUE() {
        return fIELDVALUE;
    }

    @JsonProperty("FIELD_VALUE")
    public void setFIELDVALUE(Object fIELDVALUE) {
        this.fIELDVALUE = fIELDVALUE;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
