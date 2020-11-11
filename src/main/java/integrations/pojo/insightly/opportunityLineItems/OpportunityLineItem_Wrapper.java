
package integrations.pojo.insightly.opportunityLineItems;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "insightly"
})
public class OpportunityLineItem_Wrapper {

    @JsonProperty("insightly")
    private OpportunityLineItem_Payload insightly;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("insightly")
    public OpportunityLineItem_Payload getInsightly() {
        return insightly;
    }

    @JsonProperty("insightly")
    public void setInsightly(OpportunityLineItem_Payload insightly) {
        this.insightly = insightly;
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
