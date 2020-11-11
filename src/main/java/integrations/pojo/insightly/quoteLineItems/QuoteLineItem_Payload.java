
package integrations.pojo.insightly.quoteLineItems;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "recordId",
        "recordType",
        "operation",
        "newValue"
})
public class QuoteLineItem_Payload {

    @JsonProperty("recordId")
    private Integer recordId;
    @JsonProperty("recordType")
    private String recordType;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("newValue")
    private QuoteLineItem newValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recordId")
    public Integer getRecordId() {
        return recordId;
    }

    @JsonProperty("recordId")
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    @JsonProperty("recordType")
    public String getRecordType() {
        return recordType;
    }

    @JsonProperty("recordType")
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @JsonProperty("operation")
    public String getOperation() {
        return operation;
    }

    @JsonProperty("operation")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    @JsonProperty("newValue")
    public QuoteLineItem getNewValue() {
        return newValue;
    }

    @JsonProperty("newValue")
    public void setNewValue(QuoteLineItem newValue) {
        this.newValue = newValue;
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
