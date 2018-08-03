
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
    "uploadMedicalDocuments"
})
public class Medical_ {

    @JsonProperty("uploadMedicalDocuments")
    private Boolean uploadMedicalDocuments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("uploadMedicalDocuments")
    public Boolean getUploadMedicalDocuments() {
        return uploadMedicalDocuments;
    }

    @JsonProperty("uploadMedicalDocuments")
    public void setUploadMedicalDocuments(Boolean uploadMedicalDocuments) {
        this.uploadMedicalDocuments = uploadMedicalDocuments;
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