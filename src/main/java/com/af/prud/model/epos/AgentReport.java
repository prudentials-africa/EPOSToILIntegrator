
package com.af.prud.model.epos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "howLongKnown",
    "isRelatedTo",
    "relationship",
    "isRelatedToFellowActiveAgent",
    "amountOfLifeInsuredSpouseAllInsurance",
    "distinctMark",
    "knowAnyOtherCondition",
    "examinedByDoctor",
    "examinedByDate",
    "examinedByDetails"
})
public class AgentReport {

    @Override
	public String toString() {
		return "AgentReport [howLongKnown=" + howLongKnown + ", isRelatedTo=" + isRelatedTo + ", relationship="
				+ relationship + ", isRelatedToFellowActiveAgent=" + isRelatedToFellowActiveAgent
				+ ", amountOfLifeInsuredSpouseAllInsurance=" + amountOfLifeInsuredSpouseAllInsurance + ", distinctMark="
				+ distinctMark + ", knowAnyOtherCondition=" + knowAnyOtherCondition + ", examinedByDoctor="
				+ examinedByDoctor + ", examinedByDate=" + examinedByDate + ", examinedByDetails=" + examinedByDetails
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("howLongKnown")
    private String howLongKnown;
    @JsonProperty("isRelatedTo")
    private Boolean isRelatedTo;
    @JsonProperty("relationship")
    private Relationship relationship;
    @JsonProperty("isRelatedToFellowActiveAgent")
    private Boolean isRelatedToFellowActiveAgent;
    @JsonProperty("amountOfLifeInsuredSpouseAllInsurance")
    private String amountOfLifeInsuredSpouseAllInsurance;
    @JsonProperty("distinctMark")
    private String distinctMark;
    @JsonProperty("knowAnyOtherCondition")
    private Boolean knowAnyOtherCondition;
    @JsonProperty("examinedByDoctor")
    private String examinedByDoctor;
    @JsonProperty("examinedByDate")
    private String examinedByDate;
    @JsonProperty("examinedByDetails")
    private String examinedByDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("howLongKnown")
    public String getHowLongKnown() {
        return howLongKnown;
    }

    @JsonProperty("howLongKnown")
    public void setHowLongKnown(String howLongKnown) {
        this.howLongKnown = howLongKnown;
    }

    @JsonProperty("isRelatedTo")
    public Boolean getIsRelatedTo() {
        return isRelatedTo;
    }

    @JsonProperty("isRelatedTo")
    public void setIsRelatedTo(Boolean isRelatedTo) {
        this.isRelatedTo = isRelatedTo;
    }

    @JsonProperty("relationship")
    public Relationship getRelationship() {
        return relationship;
    }

    @JsonProperty("relationship")
    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    @JsonProperty("isRelatedToFellowActiveAgent")
    public Boolean getIsRelatedToFellowActiveAgent() {
        return isRelatedToFellowActiveAgent;
    }

    @JsonProperty("isRelatedToFellowActiveAgent")
    public void setIsRelatedToFellowActiveAgent(Boolean isRelatedToFellowActiveAgent) {
        this.isRelatedToFellowActiveAgent = isRelatedToFellowActiveAgent;
    }

    @JsonProperty("amountOfLifeInsuredSpouseAllInsurance")
    public String getAmountOfLifeInsuredSpouseAllInsurance() {
        return amountOfLifeInsuredSpouseAllInsurance;
    }

    @JsonProperty("amountOfLifeInsuredSpouseAllInsurance")
    public void setAmountOfLifeInsuredSpouseAllInsurance(String amountOfLifeInsuredSpouseAllInsurance) {
        this.amountOfLifeInsuredSpouseAllInsurance = amountOfLifeInsuredSpouseAllInsurance;
    }

    @JsonProperty("distinctMark")
    public String getDistinctMark() {
        return distinctMark;
    }

    @JsonProperty("distinctMark")
    public void setDistinctMark(String distinctMark) {
        this.distinctMark = distinctMark;
    }

    @JsonProperty("knowAnyOtherCondition")
    public Boolean getKnowAnyOtherCondition() {
        return knowAnyOtherCondition;
    }

    @JsonProperty("knowAnyOtherCondition")
    public void setKnowAnyOtherCondition(Boolean knowAnyOtherCondition) {
        this.knowAnyOtherCondition = knowAnyOtherCondition;
    }

    @JsonProperty("examinedByDoctor")
    public String getExaminedByDoctor() {
        return examinedByDoctor;
    }

    @JsonProperty("examinedByDoctor")
    public void setExaminedByDoctor(String examinedByDoctor) {
        this.examinedByDoctor = examinedByDoctor;
    }

    @JsonProperty("examinedByDate")
    public String getExaminedByDate() {
        return examinedByDate;
    }

    @JsonProperty("examinedByDate")
    public void setExaminedByDate(String examinedByDate) {
        this.examinedByDate = examinedByDate;
    }

    @JsonProperty("examinedByDetails")
    public String getExaminedByDetails() {
        return examinedByDetails;
    }

    @JsonProperty("examinedByDetails")
    public void setExaminedByDetails(String examinedByDetails) {
        this.examinedByDetails = examinedByDetails;
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
