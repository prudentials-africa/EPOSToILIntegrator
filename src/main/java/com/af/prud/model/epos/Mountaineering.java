
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
    "equipment",
    "activities",
    "howLong",
    "frequency",
    "where",
    "averageClimbHeightAndGrade",
    "maximumClimbHeightAndGrade",
    "maximumHeightPlanToClimb",
    "climbAloneOrNight",
    "planToClimbInanotherCountry",
    "qualified",
    "isClubMember",
    "injured",
    "additionalInfo"
})
public class Mountaineering {

    @JsonProperty("equipment")
    private Equipment equipment;
    @JsonProperty("activities")
    private String activities;
    @JsonProperty("howLong")
    private String howLong;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("where")
    private String where;
    @JsonProperty("averageClimbHeightAndGrade")
    private String averageClimbHeightAndGrade;
    @JsonProperty("maximumClimbHeightAndGrade")
    private String maximumClimbHeightAndGrade;
    @JsonProperty("maximumHeightPlanToClimb")
    private String maximumHeightPlanToClimb;
    @JsonProperty("climbAloneOrNight")
    private Boolean climbAloneOrNight;
    @JsonProperty("planToClimbInanotherCountry")
    private Boolean planToClimbInanotherCountry;
    @JsonProperty("qualified")
    private Boolean qualified;
    @JsonProperty("isClubMember")
    private Boolean isClubMember;
    @JsonProperty("injured")
    private Boolean injured;
    @JsonProperty("additionalInfo")
    private String additionalInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("equipment")
    public Equipment getEquipment() {
        return equipment;
    }

    @JsonProperty("equipment")
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @JsonProperty("activities")
    public String getActivities() {
        return activities;
    }

    @JsonProperty("activities")
    public void setActivities(String activities) {
        this.activities = activities;
    }

    @JsonProperty("howLong")
    public String getHowLong() {
        return howLong;
    }

    @JsonProperty("howLong")
    public void setHowLong(String howLong) {
        this.howLong = howLong;
    }

    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("where")
    public String getWhere() {
        return where;
    }

    @JsonProperty("where")
    public void setWhere(String where) {
        this.where = where;
    }

    @JsonProperty("averageClimbHeightAndGrade")
    public String getAverageClimbHeightAndGrade() {
        return averageClimbHeightAndGrade;
    }

    @JsonProperty("averageClimbHeightAndGrade")
    public void setAverageClimbHeightAndGrade(String averageClimbHeightAndGrade) {
        this.averageClimbHeightAndGrade = averageClimbHeightAndGrade;
    }

    @JsonProperty("maximumClimbHeightAndGrade")
    public String getMaximumClimbHeightAndGrade() {
        return maximumClimbHeightAndGrade;
    }

    @JsonProperty("maximumClimbHeightAndGrade")
    public void setMaximumClimbHeightAndGrade(String maximumClimbHeightAndGrade) {
        this.maximumClimbHeightAndGrade = maximumClimbHeightAndGrade;
    }

    @JsonProperty("maximumHeightPlanToClimb")
    public String getMaximumHeightPlanToClimb() {
        return maximumHeightPlanToClimb;
    }

    @JsonProperty("maximumHeightPlanToClimb")
    public void setMaximumHeightPlanToClimb(String maximumHeightPlanToClimb) {
        this.maximumHeightPlanToClimb = maximumHeightPlanToClimb;
    }

    @JsonProperty("climbAloneOrNight")
    public Boolean getClimbAloneOrNight() {
        return climbAloneOrNight;
    }

    @JsonProperty("climbAloneOrNight")
    public void setClimbAloneOrNight(Boolean climbAloneOrNight) {
        this.climbAloneOrNight = climbAloneOrNight;
    }

    @JsonProperty("planToClimbInanotherCountry")
    public Boolean getPlanToClimbInanotherCountry() {
        return planToClimbInanotherCountry;
    }

    @JsonProperty("planToClimbInanotherCountry")
    public void setPlanToClimbInanotherCountry(Boolean planToClimbInanotherCountry) {
        this.planToClimbInanotherCountry = planToClimbInanotherCountry;
    }

    @JsonProperty("qualified")
    public Boolean getQualified() {
        return qualified;
    }

    @JsonProperty("qualified")
    public void setQualified(Boolean qualified) {
        this.qualified = qualified;
    }

    @JsonProperty("isClubMember")
    public Boolean getIsClubMember() {
        return isClubMember;
    }

    @JsonProperty("isClubMember")
    public void setIsClubMember(Boolean isClubMember) {
        this.isClubMember = isClubMember;
    }

    @JsonProperty("injured")
    public Boolean getInjured() {
        return injured;
    }

    @JsonProperty("injured")
    public void setInjured(Boolean injured) {
        this.injured = injured;
    }

    @JsonProperty("additionalInfo")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
