
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
    "0",
    "1"
})
public class Occupations {

    @JsonProperty("0")
    private com.prud.epos.json.classes._0 _0;
    @JsonProperty("1")
    private com.prud.epos.json.classes._1 _1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("0")
    public com.prud.epos.json.classes._0 get0() {
        return _0;
    }

    @JsonProperty("0")
    public void set0(com.prud.epos.json.classes._0 _0) {
        this._0 = _0;
    }

    @JsonProperty("1")
    public com.prud.epos.json.classes._1 get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(com.prud.epos.json.classes._1 _1) {
        this._1 = _1;
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
