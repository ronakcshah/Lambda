
package integrations.pojo.insightly.products;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PRODUCT_ID",
        "PRODUCT_NAME",
        "PRODUCT_CODE",
        "PRODUCT_SKU",
        "DESCRIPTION",
        "PRODUCT_FAMILY",
        "PRODUCT_IMAGE_URL",
        "CURRENCY_CODE",
        "DEFAULT_PRICE",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "CREATED_USER_ID",
        "OWNER_USER_ID",
        "ACTIVE",
        "CUSTOMFIELDS"
})
public class Product {

    @JsonProperty("PRODUCT_ID")
    private Integer pRODUCTID;
    @JsonProperty("PRODUCT_NAME")
    private String pRODUCTNAME;
    @JsonProperty("PRODUCT_CODE")
    private String pRODUCTCODE;
    @JsonProperty("PRODUCT_SKU")
    private String pRODUCTSKU;
    @JsonProperty("DESCRIPTION")
    private String dESCRIPTION;
    @JsonProperty("PRODUCT_FAMILY")
    private String pRODUCTFAMILY;
    @JsonProperty("PRODUCT_IMAGE_URL")
    private String pRODUCTIMAGEURL;
    @JsonProperty("CURRENCY_CODE")
    private String cURRENCYCODE;
    @JsonProperty("DEFAULT_PRICE")
    private Integer dEFAULTPRICE;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("CREATED_USER_ID")
    private Integer cREATEDUSERID;
    @JsonProperty("OWNER_USER_ID")
    private Integer oWNERUSERID;
    @JsonProperty("ACTIVE")
    private Boolean aCTIVE;
    @JsonProperty("CUSTOMFIELDS")
    private List<CustomField> cUSTOMFIELDS = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PRODUCT_ID")
    public Integer getPRODUCTID() {
        return pRODUCTID;
    }

    @JsonProperty("PRODUCT_ID")
    public void setPRODUCTID(Integer pRODUCTID) {
        this.pRODUCTID = pRODUCTID;
    }

    @JsonProperty("PRODUCT_NAME")
    public String getPRODUCTNAME() {
        return pRODUCTNAME;
    }

    @JsonProperty("PRODUCT_NAME")
    public void setPRODUCTNAME(String pRODUCTNAME) {
        this.pRODUCTNAME = pRODUCTNAME;
    }

    @JsonProperty("PRODUCT_CODE")
    public String getPRODUCTCODE() {
        return pRODUCTCODE;
    }

    @JsonProperty("PRODUCT_CODE")
    public void setPRODUCTCODE(String pRODUCTCODE) {
        this.pRODUCTCODE = pRODUCTCODE;
    }

    @JsonProperty("PRODUCT_SKU")
    public String getPRODUCTSKU() {
        return pRODUCTSKU;
    }

    @JsonProperty("PRODUCT_SKU")
    public void setPRODUCTSKU(String pRODUCTSKU) {
        this.pRODUCTSKU = pRODUCTSKU;
    }

    @JsonProperty("DESCRIPTION")
    public String getDESCRIPTION() {
        return dESCRIPTION;
    }

    @JsonProperty("DESCRIPTION")
    public void setDESCRIPTION(String dESCRIPTION) {
        this.dESCRIPTION = dESCRIPTION;
    }

    @JsonProperty("PRODUCT_FAMILY")
    public String getPRODUCTFAMILY() {
        return pRODUCTFAMILY;
    }

    @JsonProperty("PRODUCT_FAMILY")
    public void setPRODUCTFAMILY(String pRODUCTFAMILY) {
        this.pRODUCTFAMILY = pRODUCTFAMILY;
    }

    @JsonProperty("PRODUCT_IMAGE_URL")
    public String getPRODUCTIMAGEURL() {
        return pRODUCTIMAGEURL;
    }

    @JsonProperty("PRODUCT_IMAGE_URL")
    public void setPRODUCTIMAGEURL(String pRODUCTIMAGEURL) {
        this.pRODUCTIMAGEURL = pRODUCTIMAGEURL;
    }

    @JsonProperty("CURRENCY_CODE")
    public String getCURRENCYCODE() {
        return cURRENCYCODE;
    }

    @JsonProperty("CURRENCY_CODE")
    public void setCURRENCYCODE(String cURRENCYCODE) {
        this.cURRENCYCODE = cURRENCYCODE;
    }

    @JsonProperty("DEFAULT_PRICE")
    public Integer getDEFAULTPRICE() {
        return dEFAULTPRICE;
    }

    @JsonProperty("DEFAULT_PRICE")
    public void setDEFAULTPRICE(Integer dEFAULTPRICE) {
        this.dEFAULTPRICE = dEFAULTPRICE;
    }

    @JsonProperty("DATE_CREATED_UTC")
    public String getDATECREATEDUTC() {
        return dATECREATEDUTC;
    }

    @JsonProperty("DATE_CREATED_UTC")
    public void setDATECREATEDUTC(String dATECREATEDUTC) {
        this.dATECREATEDUTC = dATECREATEDUTC;
    }

    @JsonProperty("DATE_UPDATED_UTC")
    public String getDATEUPDATEDUTC() {
        return dATEUPDATEDUTC;
    }

    @JsonProperty("DATE_UPDATED_UTC")
    public void setDATEUPDATEDUTC(String dATEUPDATEDUTC) {
        this.dATEUPDATEDUTC = dATEUPDATEDUTC;
    }

    @JsonProperty("CREATED_USER_ID")
    public Integer getCREATEDUSERID() {
        return cREATEDUSERID;
    }

    @JsonProperty("CREATED_USER_ID")
    public void setCREATEDUSERID(Integer cREATEDUSERID) {
        this.cREATEDUSERID = cREATEDUSERID;
    }

    @JsonProperty("OWNER_USER_ID")
    public Integer getOWNERUSERID() {
        return oWNERUSERID;
    }

    @JsonProperty("OWNER_USER_ID")
    public void setOWNERUSERID(Integer oWNERUSERID) {
        this.oWNERUSERID = oWNERUSERID;
    }

    @JsonProperty("ACTIVE")
    public Boolean getACTIVE() {
        return aCTIVE;
    }

    @JsonProperty("ACTIVE")
    public void setACTIVE(Boolean aCTIVE) {
        this.aCTIVE = aCTIVE;
    }

    @JsonProperty("CUSTOMFIELDS")
    public List<CustomField> getCUSTOMFIELDS() {
        return cUSTOMFIELDS;
    }

    @JsonProperty("CUSTOMFIELDS")
    public void setCUSTOMFIELDS(List<CustomField> cUSTOMFIELDS) {
        this.cUSTOMFIELDS = cUSTOMFIELDS;
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
