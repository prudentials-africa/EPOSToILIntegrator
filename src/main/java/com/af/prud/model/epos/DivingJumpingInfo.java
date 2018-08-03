
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
    "hasEngageInScubaDiving",
    "hasEngageInSkyDiving",
    "hasEngageInBungeeJumping",
    "hasCertification"
})
public class DivingJumpingInfo {

    @JsonProperty("hasEngageInScubaDiving")
    private Boolean hasEngageInScubaDiving;
    @JsonProperty("hasEngageInSkyDiving")
    private Boolean hasEngageInSkyDiving;
    @JsonProperty("hasEngageInBungeeJumping")
    private Boolean hasEngageInBungeeJumping;
    @JsonProperty("hasCertification")
    private Boolean hasCertification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hasEngageInScubaDiving")
    public Boolean getHasEngageInScubaDiving() {
        return hasEngageInScubaDiving;
    }

    @JsonProperty("hasEngageInScubaDiving")
    public void setHasEngageInScubaDiving(Boolean hasEngageInScubaDiving) {
        this.hasEngageInScubaDiving = hasEngageInScubaDiving;
    }

    @JsonProperty("hasEngageInSkyDiving")
    public Boolean getHasEngageInSkyDiving() {
        return hasEngageInSkyDiving;
    }

    @JsonProperty("hasEngageInSkyDiving")
    public void setHasEngageInSkyDiving(Boolean hasEngageInSkyDiving) {
        this.hasEngageInSkyDiving = hasEngageInSkyDiving;
    }

    @JsonProperty("hasEngageInBungeeJumping")
    public Boolean getHasEngageInBungeeJumping() {
        return hasEngageInBungeeJumping;
    }

    @JsonProperty("hasEngageInBungeeJumping")
    public void setHasEngageInBungeeJumping(Boolean hasEngageInBungeeJumping) {
        this.hasEngageInBungeeJumping = hasEngageInBungeeJumping;
    }

    @JsonProperty("hasCertification")
    public Boolean getHasCertification() {
        return hasCertification;
    }

    @JsonProperty("hasCertification")
    public void setHasCertification(Boolean hasCertification) {
        this.hasCertification = hasCertification;
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
