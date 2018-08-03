
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
    "occupationChange"
})
public class _1 {

    @JsonProperty("employment")
    private String employment;
    @JsonProperty("occupation")
    private Occupation_ occupation;
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
    public Occupation_ getOccupation() {
        return occupation;
    }

    @JsonProperty("occupation")
    public void setOccupation(Occupation_ occupation) {
        this.occupation = occupation;
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
