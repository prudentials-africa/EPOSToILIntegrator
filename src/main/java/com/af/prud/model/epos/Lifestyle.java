
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
    "displayDivingAndJumpingForm",
    "displayRacingForm",
    "displayMountaineerForm",
    "displayGeneralSportForm",
    "displayAviationForm",
    "flownAircraft",
    "dangerousSports",
    "motorcycle",
    "divingAndJumping",
    "lifeThreat",
    "politics",
    "smoke",
    "alcohol",
    "beerQuantity",
    "drugs",
    "riskToAids",
    "mountaineer",
    "otherHazardousSport",
    "mountaineering",
    "racing",
    "wineQuantity",
    "liquorQuantity",
    "aviation",
    "divingJumpingInfo"
})
public class Lifestyle {

    @JsonProperty("displayDivingAndJumpingForm")
    private Object displayDivingAndJumpingForm;
    @JsonProperty("displayRacingForm")
    private Object displayRacingForm;
    @JsonProperty("displayMountaineerForm")
    private Object displayMountaineerForm;
    @JsonProperty("displayGeneralSportForm")
    private Object displayGeneralSportForm;
    @JsonProperty("displayAviationForm")
    private Object displayAviationForm;
    @JsonProperty("flownAircraft")
    private Boolean flownAircraft;
    @JsonProperty("dangerousSports")
    private Boolean dangerousSports;
    @JsonProperty("motorcycle")
    private Boolean motorcycle;
    @JsonProperty("divingAndJumping")
    private Boolean divingAndJumping;
    @JsonProperty("lifeThreat")
    private Boolean lifeThreat;
    @JsonProperty("politics")
    private Boolean politics;
    @JsonProperty("smoke")
    private Boolean smoke;
    @JsonProperty("alcohol")
    private Boolean alcohol;
    @JsonProperty("beerQuantity")
    private Integer beerQuantity;
    @JsonProperty("drugs")
    private Boolean drugs;
    @JsonProperty("riskToAids")
    private Boolean riskToAids;
    @JsonProperty("mountaineer")
    private Boolean mountaineer;
    @JsonProperty("otherHazardousSport")
    private Boolean otherHazardousSport;
    @JsonProperty("mountaineering")
    private Mountaineering mountaineering;
    @JsonProperty("racing")
    private Boolean racing;
    @JsonProperty("wineQuantity")
    private Integer wineQuantity;
    @JsonProperty("liquorQuantity")
    private Integer liquorQuantity;
    @JsonProperty("aviation")
    private Aviation aviation;
    @JsonProperty("divingJumpingInfo")
    private DivingJumpingInfo divingJumpingInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayDivingAndJumpingForm")
    public Object getDisplayDivingAndJumpingForm() {
        return displayDivingAndJumpingForm;
    }

    @JsonProperty("displayDivingAndJumpingForm")
    public void setDisplayDivingAndJumpingForm(Object displayDivingAndJumpingForm) {
        this.displayDivingAndJumpingForm = displayDivingAndJumpingForm;
    }

    @JsonProperty("displayRacingForm")
    public Object getDisplayRacingForm() {
        return displayRacingForm;
    }

    @JsonProperty("displayRacingForm")
    public void setDisplayRacingForm(Object displayRacingForm) {
        this.displayRacingForm = displayRacingForm;
    }

    @JsonProperty("displayMountaineerForm")
    public Object getDisplayMountaineerForm() {
        return displayMountaineerForm;
    }

    @JsonProperty("displayMountaineerForm")
    public void setDisplayMountaineerForm(Object displayMountaineerForm) {
        this.displayMountaineerForm = displayMountaineerForm;
    }

    @JsonProperty("displayGeneralSportForm")
    public Object getDisplayGeneralSportForm() {
        return displayGeneralSportForm;
    }

    @JsonProperty("displayGeneralSportForm")
    public void setDisplayGeneralSportForm(Object displayGeneralSportForm) {
        this.displayGeneralSportForm = displayGeneralSportForm;
    }

    @JsonProperty("displayAviationForm")
    public Object getDisplayAviationForm() {
        return displayAviationForm;
    }

    @JsonProperty("displayAviationForm")
    public void setDisplayAviationForm(Object displayAviationForm) {
        this.displayAviationForm = displayAviationForm;
    }

    @JsonProperty("flownAircraft")
    public Boolean getFlownAircraft() {
        return flownAircraft;
    }

    @JsonProperty("flownAircraft")
    public void setFlownAircraft(Boolean flownAircraft) {
        this.flownAircraft = flownAircraft;
    }

    @JsonProperty("dangerousSports")
    public Boolean getDangerousSports() {
        return dangerousSports;
    }

    @JsonProperty("dangerousSports")
    public void setDangerousSports(Boolean dangerousSports) {
        this.dangerousSports = dangerousSports;
    }

    @JsonProperty("motorcycle")
    public Boolean getMotorcycle() {
        return motorcycle;
    }

    @JsonProperty("motorcycle")
    public void setMotorcycle(Boolean motorcycle) {
        this.motorcycle = motorcycle;
    }

    @JsonProperty("divingAndJumping")
    public Boolean getDivingAndJumping() {
        return divingAndJumping;
    }

    @JsonProperty("divingAndJumping")
    public void setDivingAndJumping(Boolean divingAndJumping) {
        this.divingAndJumping = divingAndJumping;
    }

    @JsonProperty("lifeThreat")
    public Boolean getLifeThreat() {
        return lifeThreat;
    }

    @JsonProperty("lifeThreat")
    public void setLifeThreat(Boolean lifeThreat) {
        this.lifeThreat = lifeThreat;
    }

    @JsonProperty("politics")
    public Boolean getPolitics() {
        return politics;
    }

    @JsonProperty("politics")
    public void setPolitics(Boolean politics) {
        this.politics = politics;
    }

    @JsonProperty("smoke")
    public Boolean getSmoke() {
        return smoke;
    }

    @JsonProperty("smoke")
    public void setSmoke(Boolean smoke) {
        this.smoke = smoke;
    }

    @JsonProperty("alcohol")
    public Boolean getAlcohol() {
        return alcohol;
    }

    @JsonProperty("alcohol")
    public void setAlcohol(Boolean alcohol) {
        this.alcohol = alcohol;
    }

    @JsonProperty("beerQuantity")
    public Integer getBeerQuantity() {
        return beerQuantity;
    }

    @JsonProperty("beerQuantity")
    public void setBeerQuantity(Integer beerQuantity) {
        this.beerQuantity = beerQuantity;
    }

    @JsonProperty("drugs")
    public Boolean getDrugs() {
        return drugs;
    }

    @JsonProperty("drugs")
    public void setDrugs(Boolean drugs) {
        this.drugs = drugs;
    }

    @JsonProperty("riskToAids")
    public Boolean getRiskToAids() {
        return riskToAids;
    }

    @JsonProperty("riskToAids")
    public void setRiskToAids(Boolean riskToAids) {
        this.riskToAids = riskToAids;
    }

    @JsonProperty("mountaineer")
    public Boolean getMountaineer() {
        return mountaineer;
    }

    @JsonProperty("mountaineer")
    public void setMountaineer(Boolean mountaineer) {
        this.mountaineer = mountaineer;
    }

    @JsonProperty("otherHazardousSport")
    public Boolean getOtherHazardousSport() {
        return otherHazardousSport;
    }

    @JsonProperty("otherHazardousSport")
    public void setOtherHazardousSport(Boolean otherHazardousSport) {
        this.otherHazardousSport = otherHazardousSport;
    }

    @JsonProperty("mountaineering")
    public Mountaineering getMountaineering() {
        return mountaineering;
    }

    @JsonProperty("mountaineering")
    public void setMountaineering(Mountaineering mountaineering) {
        this.mountaineering = mountaineering;
    }

    @JsonProperty("racing")
    public Boolean getRacing() {
        return racing;
    }

    @JsonProperty("racing")
    public void setRacing(Boolean racing) {
        this.racing = racing;
    }

    @JsonProperty("wineQuantity")
    public Integer getWineQuantity() {
        return wineQuantity;
    }

    @JsonProperty("wineQuantity")
    public void setWineQuantity(Integer wineQuantity) {
        this.wineQuantity = wineQuantity;
    }

    @JsonProperty("liquorQuantity")
    public Integer getLiquorQuantity() {
        return liquorQuantity;
    }

    @JsonProperty("liquorQuantity")
    public void setLiquorQuantity(Integer liquorQuantity) {
        this.liquorQuantity = liquorQuantity;
    }

    @JsonProperty("aviation")
    public Aviation getAviation() {
        return aviation;
    }

    @JsonProperty("aviation")
    public void setAviation(Aviation aviation) {
        this.aviation = aviation;
    }

    @JsonProperty("divingJumpingInfo")
    public DivingJumpingInfo getDivingJumpingInfo() {
        return divingJumpingInfo;
    }

    @JsonProperty("divingJumpingInfo")
    public void setDivingJumpingInfo(DivingJumpingInfo divingJumpingInfo) {
        this.divingJumpingInfo = divingJumpingInfo;
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
