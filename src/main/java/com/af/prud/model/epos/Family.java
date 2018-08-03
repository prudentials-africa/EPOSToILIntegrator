
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
    "isAssuredForm",
    "isNotSiblingAndAssuredForm"
})
public class Family {

    @JsonProperty("isAssuredForm")
    private Boolean isAssuredForm;
    @JsonProperty("isNotSiblingAndAssuredForm")
    private Boolean isNotSiblingAndAssuredForm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isAssuredForm")
    public Boolean getIsAssuredForm() {
        return isAssuredForm;
    }

    @JsonProperty("isAssuredForm")
    public void setIsAssuredForm(Boolean isAssuredForm) {
        this.isAssuredForm = isAssuredForm;
    }

    @JsonProperty("isNotSiblingAndAssuredForm")
    public Boolean getIsNotSiblingAndAssuredForm() {
        return isNotSiblingAndAssuredForm;
    }

    @JsonProperty("isNotSiblingAndAssuredForm")
    public void setIsNotSiblingAndAssuredForm(Boolean isNotSiblingAndAssuredForm) {
        this.isNotSiblingAndAssuredForm = isNotSiblingAndAssuredForm;
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
