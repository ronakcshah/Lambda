package integrations.pojo.insightly.leads;

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
public class Lead_Payload {

    @JsonProperty("recordId")
    private Long recordId;
    @JsonProperty("recordType")
    private String recordType;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("newValue")
    private Lead newValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recordId")
    public Long getRecordId() {
        return recordId;
    }

    @JsonProperty("recordId")
    public void setRecordId(Long recordId) {
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
    public Lead getNewValue() {
        return newValue;
    }

    @JsonProperty("newValue")
    public void setNewValue(Lead newValue) {
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
