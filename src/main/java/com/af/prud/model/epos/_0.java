
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
    "employment",
    "occupation",
    "businessNature",
    "city",
    "employerName",
    "addressBusiness",
    "countryBusiness",
    "zipcodeBusiness",
    "occupationChange"
})
public class _0 {

    @JsonProperty("employment")
    private String employment;
    @JsonProperty("occupation")
    private Occupation occupation;
    @JsonProperty("businessNature")
    private BusinessNature businessNature;
    @JsonProperty("city")
    private City_ city;
    @JsonProperty("employerName")
    private String employerName;
    @JsonProperty("addressBusiness")
    private String addressBusiness;
    @JsonProperty("countryBusiness")
    private CountryBusiness countryBusiness;
    @JsonProperty("zipcodeBusiness")
    private String zipcodeBusiness;
    @JsonProperty("occupationChange")
    private Boolean occupationChange;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("employment")
    public String getEmployment() {
        return employment;
    }

    @JsonProperty("employment")
    public void setEmployment(String employment) {
        this.employment = employment;
    }

    @JsonProperty("occupation")
    public Occupation getOccupation() {
        return occupation;
    }

    @JsonProperty("occupation")
    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    @JsonProperty("businessNature")
    public BusinessNature getBusinessNature() {
        return businessNature;
    }

    @JsonProperty("businessNature")
    public void setBusinessNature(BusinessNature businessNature) {
        this.businessNature = businessNature;
    }

    @JsonProperty("city")
    public City_ getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City_ city) {
        this.city = city;
    }

    @JsonProperty("employerName")
    public String getEmployerName() {
        return employerName;
    }

    @JsonProperty("employerName")
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    @JsonProperty("addressBusiness")
    public String getAddressBusiness() {
        return addressBusiness;
    }

    @JsonProperty("addressBusiness")
    public void setAddressBusiness(String addressBusiness) {
        this.addressBusiness = addressBusiness;
    }

    @JsonProperty("countryBusiness")
    public CountryBusiness getCountryBusiness() {
        return countryBusiness;
    }

    @JsonProperty("countryBusiness")
    public void setCountryBusiness(CountryBusiness countryBusiness) {
        this.countryBusiness = countryBusiness;
    }

    @JsonProperty("zipcodeBusiness")
    public String getZipcodeBusiness() {
        return zipcodeBusiness;
    }

    @JsonProperty("zipcodeBusiness")
    public void setZipcodeBusiness(String zipcodeBusiness) {
        this.zipcodeBusiness = zipcodeBusiness;
    }

    @JsonProperty("occupationChange")
    public Boolean getOccupationChange() {
        return occupationChange;
    }

    @JsonProperty("occupationChange")
    public void setOccupationChange(Boolean occupationChange) {
        this.occupationChange = occupationChange;
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
