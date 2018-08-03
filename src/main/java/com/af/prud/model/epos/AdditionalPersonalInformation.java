
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
    "birthCity",
    "cityPermanent",
    "havePriorName",
    "civilStatus",
    "birthCountry",
    "nationality",
    "identificationType",
    "identificationNumber",
    "fatcaQuestion",
    "addressPermanent",
    "zipcodePermanent",
    "countryPermanent",
    "preferredMailingAddress",
    "planToChangeAddress",
    "haveBeneficialOwner"
})
public class AdditionalPersonalInformation {

    @JsonProperty("birthCity")
    private BirthCity birthCity;
    @JsonProperty("cityPermanent")
    private CityPermanent cityPermanent;
    @JsonProperty("havePriorName")
    private Boolean havePriorName;
    @JsonProperty("civilStatus")
    private CivilStatus civilStatus;
    @JsonProperty("birthCountry")
    private BirthCountry birthCountry;
    @JsonProperty("nationality")
    private Nationality nationality;
    @JsonProperty("identificationType")
    private IdentificationType identificationType;
    @JsonProperty("identificationNumber")
    private String identificationNumber;
    @JsonProperty("fatcaQuestion")
    private Boolean fatcaQuestion;
    @JsonProperty("addressPermanent")
    private String addressPermanent;
    @JsonProperty("zipcodePermanent")
    private String zipcodePermanent;
    @JsonProperty("countryPermanent")
    private CountryPermanent countryPermanent;
    @JsonProperty("preferredMailingAddress")
    private String preferredMailingAddress;
    @JsonProperty("planToChangeAddress")
    private Boolean planToChangeAddress;
    @JsonProperty("haveBeneficialOwner")
    private Boolean haveBeneficialOwner;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("birthCity")
    public BirthCity getBirthCity() {
        return birthCity;
    }

    @JsonProperty("birthCity")
    public void setBirthCity(BirthCity birthCity) {
        this.birthCity = birthCity;
    }

    @JsonProperty("cityPermanent")
    public CityPermanent getCityPermanent() {
        return cityPermanent;
    }

    @JsonProperty("cityPermanent")
    public void setCityPermanent(CityPermanent cityPermanent) {
        this.cityPermanent = cityPermanent;
    }

    @JsonProperty("havePriorName")
    public Boolean getHavePriorName() {
        return havePriorName;
    }

    @JsonProperty("havePriorName")
    public void setHavePriorName(Boolean havePriorName) {
        this.havePriorName = havePriorName;
    }

    @JsonProperty("civilStatus")
    public CivilStatus getCivilStatus() {
        return civilStatus;
    }

    @JsonProperty("civilStatus")
    public void setCivilStatus(CivilStatus civilStatus) {
        this.civilStatus = civilStatus;
    }

    @JsonProperty("birthCountry")
    public BirthCountry getBirthCountry() {
        return birthCountry;
    }

    @JsonProperty("birthCountry")
    public void setBirthCountry(BirthCountry birthCountry) {
        this.birthCountry = birthCountry;
    }

    @JsonProperty("nationality")
    public Nationality getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("identificationType")
    public IdentificationType getIdentificationType() {
        return identificationType;
    }

    @JsonProperty("identificationType")
    public void setIdentificationType(IdentificationType identificationType) {
        this.identificationType = identificationType;
    }

    @JsonProperty("identificationNumber")
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    @JsonProperty("identificationNumber")
    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @JsonProperty("fatcaQuestion")
    public Boolean getFatcaQuestion() {
        return fatcaQuestion;
    }

    @JsonProperty("fatcaQuestion")
    public void setFatcaQuestion(Boolean fatcaQuestion) {
        this.fatcaQuestion = fatcaQuestion;
    }

    @JsonProperty("addressPermanent")
    public String getAddressPermanent() {
        return addressPermanent;
    }

    @JsonProperty("addressPermanent")
    public void setAddressPermanent(String addressPermanent) {
        this.addressPermanent = addressPermanent;
    }

    @JsonProperty("zipcodePermanent")
    public String getZipcodePermanent() {
        return zipcodePermanent;
    }

    @JsonProperty("zipcodePermanent")
    public void setZipcodePermanent(String zipcodePermanent) {
        this.zipcodePermanent = zipcodePermanent;
    }

    @JsonProperty("countryPermanent")
    public CountryPermanent getCountryPermanent() {
        return countryPermanent;
    }

    @JsonProperty("countryPermanent")
    public void setCountryPermanent(CountryPermanent countryPermanent) {
        this.countryPermanent = countryPermanent;
    }

    @JsonProperty("preferredMailingAddress")
    public String getPreferredMailingAddress() {
        return preferredMailingAddress;
    }

    @JsonProperty("preferredMailingAddress")
    public void setPreferredMailingAddress(String preferredMailingAddress) {
        this.preferredMailingAddress = preferredMailingAddress;
    }

    @JsonProperty("planToChangeAddress")
    public Boolean getPlanToChangeAddress() {
        return planToChangeAddress;
    }

    @JsonProperty("planToChangeAddress")
    public void setPlanToChangeAddress(Boolean planToChangeAddress) {
        this.planToChangeAddress = planToChangeAddress;
    }

    @JsonProperty("haveBeneficialOwner")
    public Boolean getHaveBeneficialOwner() {
        return haveBeneficialOwner;
    }

    @JsonProperty("haveBeneficialOwner")
    public void setHaveBeneficialOwner(Boolean haveBeneficialOwner) {
        this.haveBeneficialOwner = haveBeneficialOwner;
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
