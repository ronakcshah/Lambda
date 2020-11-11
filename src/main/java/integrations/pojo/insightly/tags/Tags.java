
package integrations.pojo.insightly.tags;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "TAG_NAME"
})
public class Tags {

    @JsonProperty("TAG_NAME")
    private String tAGNAME;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TAG_NAME")
    public String getTAGNAME() {
        return tAGNAME;
    }

    @JsonProperty("TAG_NAME")
    public void setTAGNAME(String tAGNAME) {
        this.tAGNAME = tAGNAME;
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
