
package integrations.pojo.insightly.products;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "insightly"
})
public class Product_Wrapper {

    @JsonProperty("insightly")
    private Product_Payload insightly;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("insightly")
    public Product_Payload getInsightly() {
        return insightly;
    }

    @JsonProperty("insightly")
    public void setInsightly(Product_Payload insightlyObjectProductDetails) {
        this.insightly = insightlyObjectProductDetails;
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
