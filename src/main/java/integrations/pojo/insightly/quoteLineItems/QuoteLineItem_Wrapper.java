
package integrations.pojo.insightly.quoteLineItems;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "insightly"
})
public class QuoteLineItem_Wrapper {

    @JsonProperty("insightly")
    private QuoteLineItem_Payload insightly;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("insightly")
    public QuoteLineItem_Payload getInsightly() {
        return insightly;
    }

    @JsonProperty("insightly")
    public void setInsightly(QuoteLineItem_Payload insightly) {
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
