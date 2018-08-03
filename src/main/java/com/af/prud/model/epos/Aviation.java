
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
    "scheduledAirlinesPassenger",
    "nonScheduledAirlinesPassenger",
    "memberOfTheCrew",
    "pilotOrCoPilotOrStudentPilot",
    "flyWithPartners",
    "howLongFlying",
    "hurtWhenFlying"
})
public class Aviation {

    @JsonProperty("scheduledAirlinesPassenger")
    private Boolean scheduledAirlinesPassenger;
    @JsonProperty("nonScheduledAirlinesPassenger")
    private Boolean nonScheduledAirlinesPassenger;
    @JsonProperty("memberOfTheCrew")
    private Boolean memberOfTheCrew;
    @JsonProperty("pilotOrCoPilotOrStudentPilot")
    private Boolean pilotOrCoPilotOrStudentPilot;
    @JsonProperty("flyWithPartners")
    private Boolean flyWithPartners;
    @JsonProperty("howLongFlying")
    private String howLongFlying;
    @JsonProperty("hurtWhenFlying")
    private Boolean hurtWhenFlying;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scheduledAirlinesPassenger")
    public Boolean getScheduledAirlinesPassenger() {
        return scheduledAirlinesPassenger;
    }

    @JsonProperty("scheduledAirlinesPassenger")
    public void setScheduledAirlinesPassenger(Boolean scheduledAirlinesPassenger) {
        this.scheduledAirlinesPassenger = scheduledAirlinesPassenger;
    }

    @JsonProperty("nonScheduledAirlinesPassenger")
    public Boolean getNonScheduledAirlinesPassenger() {
        return nonScheduledAirlinesPassenger;
    }

    @JsonProperty("nonScheduledAirlinesPassenger")
    public void setNonScheduledAirlinesPassenger(Boolean nonScheduledAirlinesPassenger) {
        this.nonScheduledAirlinesPassenger = nonScheduledAirlinesPassenger;
    }

    @JsonProperty("memberOfTheCrew")
    public Boolean getMemberOfTheCrew() {
        return memberOfTheCrew;
    }

    @JsonProperty("memberOfTheCrew")
    public void setMemberOfTheCrew(Boolean memberOfTheCrew) {
        this.memberOfTheCrew = memberOfTheCrew;
    }

    @JsonProperty("pilotOrCoPilotOrStudentPilot")
    public Boolean getPilotOrCoPilotOrStudentPilot() {
        return pilotOrCoPilotOrStudentPilot;
    }

    @JsonProperty("pilotOrCoPilotOrStudentPilot")
    public void setPilotOrCoPilotOrStudentPilot(Boolean pilotOrCoPilotOrStudentPilot) {
        this.pilotOrCoPilotOrStudentPilot = pilotOrCoPilotOrStudentPilot;
    }

    @JsonProperty("flyWithPartners")
    public Boolean getFlyWithPartners() {
        return flyWithPartners;
    }

    @JsonProperty("flyWithPartners")
    public void setFlyWithPartners(Boolean flyWithPartners) {
        this.flyWithPartners = flyWithPartners;
    }

    @JsonProperty("howLongFlying")
    public String getHowLongFlying() {
        return howLongFlying;
    }

    @JsonProperty("howLongFlying")
    public void setHowLongFlying(String howLongFlying) {
        this.howLongFlying = howLongFlying;
    }

    @JsonProperty("hurtWhenFlying")
    public Boolean getHurtWhenFlying() {
        return hurtWhenFlying;
    }

    @JsonProperty("hurtWhenFlying")
    public void setHurtWhenFlying(Boolean hurtWhenFlying) {
        this.hurtWhenFlying = hurtWhenFlying;
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
