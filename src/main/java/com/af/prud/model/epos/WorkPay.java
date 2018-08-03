
package com.af.prud.model.epos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "occupations",
    "incomeBeforeTax",
    "netWorth",
    "sourcesOfFunds"
})
public class WorkPay {

    @JsonProperty("occupations")
    private Occupations occupations;
    @JsonProperty("incomeBeforeTax")
    private Integer incomeBeforeTax;
    @JsonProperty("netWorth")
    private Integer netWorth;
    @JsonProperty("sourcesOfFunds")
    private String sourcesOfFunds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("occupations")
    public Occupations getOccupations() {
        return occupations;
    }

    @JsonProperty("occupations")
    public void setOccupations(Occupations occupations) {
        this.occupations = occupations;
    }

    @JsonProperty("incomeBeforeTax")
    public Integer getIncomeBeforeTax() {
        return incomeBeforeTax;
    }

    @JsonProperty("incomeBeforeTax")
    public void setIncomeBeforeTax(Integer incomeBeforeTax) {
        this.incomeBeforeTax = incomeBeforeTax;
    }

    @JsonProperty("netWorth")
    public Integer getNetWorth() {
        return netWorth;
    }

    @JsonProperty("netWorth")
    public void setNetWorth(Integer netWorth) {
        this.netWorth = netWorth;
    }

    @JsonProperty("sourcesOfFunds")
    public String getSourcesOfFunds() {
        return sourcesOfFunds;
    }

    @JsonProperty("sourcesOfFunds")
    public void setSourcesOfFunds(String sourcesOfFunds) {
        this.sourcesOfFunds = sourcesOfFunds;
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
