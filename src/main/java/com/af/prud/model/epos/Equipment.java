
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
    "1",
    "2",
    "3",
    "4",
    "5",
    "6"
})
public class Equipment {

    @JsonProperty("0")
    private Object _0;
    @JsonProperty("1")
    private Object _1;
    @JsonProperty("2")
    private Object _2;
    @JsonProperty("3")
    private Object _3;
    @JsonProperty("4")
    private Object _4;
    @JsonProperty("5")
    private Object _5;
    @JsonProperty("6")
    private Object _6;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("0")
    public Object get0() {
        return _0;
    }

    @JsonProperty("0")
    public void set0(Object _0) {
        this._0 = _0;
    }

    @JsonProperty("1")
    public Object get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(Object _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public Object get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(Object _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public Object get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(Object _3) {
        this._3 = _3;
    }

    @JsonProperty("4")
    public Object get4() {
        return _4;
    }

    @JsonProperty("4")
    public void set4(Object _4) {
        this._4 = _4;
    }

    @JsonProperty("5")
    public Object get5() {
        return _5;
    }

    @JsonProperty("5")
    public void set5(Object _5) {
        this._5 = _5;
    }

    @JsonProperty("6")
    public Object get6() {
        return _6;
    }

    @JsonProperty("6")
    public void set6(Object _6) {
        this._6 = _6;
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
