
package integrations.pojo.insightly.organizations;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "EMAIL_DOMAIN_ID",
        "EMAIL_DOMAIN"
})
public class Organization_EmailDomain {

    @JsonProperty("EMAIL_DOMAIN_ID")
    private Long eMAILDOMAINID;
    @JsonProperty("EMAIL_DOMAIN")
    private String eMAILDOMAIN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EMAIL_DOMAIN_ID")
    public Long getEMAILDOMAINID() {
        return eMAILDOMAINID;
    }

    @JsonProperty("EMAIL_DOMAIN_ID")
    public void setEMAILDOMAINID(Long eMAILDOMAINID) {
        this.eMAILDOMAINID = eMAILDOMAINID;
    }

    @JsonProperty("EMAIL_DOMAIN")
    public String getEMAILDOMAIN() {
        return eMAILDOMAIN;
    }

    @JsonProperty("EMAIL_DOMAIN")
    public void setEMAILDOMAIN(String eMAILDOMAIN) {
        this.eMAILDOMAIN = eMAILDOMAIN;
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
