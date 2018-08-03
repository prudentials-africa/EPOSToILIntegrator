
package com.af.prud.model.epos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "agentReport", "country", "medical", "address", "clientId", "mobileCountryCode", "gender", "city",
		"documents", "mobile", "dateOfBirth", "lifestyle", "workPay", "zipcode", "createdAt", "cityCustom",
		"phoneCountryCode", "phone", "additionalPersonalInformation", "name", "id", "family", "email", "age" })
public class Assured {

	@JsonProperty("agentReport")
	private AgentReport agentReport;
	@JsonProperty("country")
	private Country country;
	@JsonProperty("medical")
	private Medical medical;
	@JsonProperty("address")
	private String address;
	@JsonProperty("clientId")
	private String clientId;
	@JsonProperty("mobileCountryCode")
	private MobileCountryCode mobileCountryCode;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("city")
	private City city;
	@JsonProperty("documents")
	private Documents documents;
	@JsonProperty("mobile")
	private String mobile;
	@JsonProperty("dateOfBirth")
	private String dateOfBirth;
	@JsonProperty("lifestyle")
	private Lifestyle lifestyle;
	@JsonProperty("workPay")
	private WorkPay workPay;
	@JsonProperty("zipcode")
	private String zipcode;
	@JsonProperty("createdAt")
	private String createdAt;
	@JsonProperty("cityCustom")
	private String cityCustom;
	@JsonProperty("phoneCountryCode")
	private PhoneCountryCode phoneCountryCode;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("additionalPersonalInformation")
	private AdditionalPersonalInformation additionalPersonalInformation;
	@JsonProperty("name")
	private Name name;
	@JsonProperty("id")
	private String id;
	@JsonProperty("family")
	private Family family;
	@JsonProperty("email")
	private String email;
	@JsonProperty("age")
	private String age;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("agentReport")
	public AgentReport getAgentReport() {
		return agentReport;
	}

	@JsonProperty("agentReport")
	public void setAgentReport(AgentReport agentReport) {
		this.agentReport = agentReport;
	}

	@JsonProperty("country")
	public Country getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(Country country) {
		this.country = country;
	}

	@JsonProperty("medical")
	public Medical getMedical() {
		return medical;
	}

	@JsonProperty("medical")
	public void setMedical(Medical medical) {
		this.medical = medical;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("clientId")
	public String getClientId() {
		return clientId;
	}

	@JsonProperty("clientId")
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@JsonProperty("mobileCountryCode")
	public MobileCountryCode getMobileCountryCode() {
		return mobileCountryCode;
	}

	@JsonProperty("mobileCountryCode")
	public void setMobileCountryCode(MobileCountryCode mobileCountryCode) {
		this.mobileCountryCode = mobileCountryCode;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("city")
	public City getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(City city) {
		this.city = city;
	}

	@JsonProperty("documents")
	public Documents getDocuments() {
		return documents;
	}

	@JsonProperty("documents")
	public void setDocuments(Documents documents) {
		this.documents = documents;
	}

	@JsonProperty("mobile")
	public String getMobile() {
		return mobile;
	}

	@JsonProperty("mobile")
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@JsonProperty("dateOfBirth")
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	@JsonProperty("dateOfBirth")
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@JsonProperty("lifestyle")
	public Lifestyle getLifestyle() {
		return lifestyle;
	}

	@JsonProperty("lifestyle")
	public void setLifestyle(Lifestyle lifestyle) {
		this.lifestyle = lifestyle;
	}

	@JsonProperty("workPay")
	public WorkPay getWorkPay() {
		return workPay;
	}

	@JsonProperty("workPay")
	public void setWorkPay(WorkPay workPay) {
		this.workPay = workPay;
	}

	@JsonProperty("zipcode")
	public String getZipcode() {
		return zipcode;
	}

	@JsonProperty("zipcode")
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@JsonProperty("createdAt")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("createdAt")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("cityCustom")
	public String getCityCustom() {
		return cityCustom;
	}

	@JsonProperty("cityCustom")
	public void setCityCustom(String cityCustom) {
		this.cityCustom = cityCustom;
	}

	@JsonProperty("phoneCountryCode")
	public PhoneCountryCode getPhoneCountryCode() {
		return phoneCountryCode;
	}

	@JsonProperty("phoneCountryCode")
	public void setPhoneCountryCode(PhoneCountryCode phoneCountryCode) {
		this.phoneCountryCode = phoneCountryCode;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonProperty("additionalPersonalInformation")
	public AdditionalPersonalInformation getAdditionalPersonalInformation() {
		return additionalPersonalInformation;
	}

	@JsonProperty("additionalPersonalInformation")
	public void setAdditionalPersonalInformation(AdditionalPersonalInformation additionalPersonalInformation) {
		this.additionalPersonalInformation = additionalPersonalInformation;
	}

	@JsonProperty("name")
	public Name getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(Name name) {
		this.name = name;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("family")
	public Family getFamily() {
		return family;
	}

	@JsonProperty("family")
	public void setFamily(Family family) {
		this.family = family;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("age")
	public String getAge() {
		return age;
	}

	@JsonProperty("age")
	public void setAge(String age) {
		this.age = age;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Assured [agentReport=" + agentReport + ", country=" + country + ", medical=" + medical + ", address="
				+ address + ", clientId=" + clientId + ", mobileCountryCode=" + mobileCountryCode + ", gender=" + gender
				+ ", city=" + city + ", documents=" + documents + ", mobile=" + mobile + ", dateOfBirth=" + dateOfBirth
				+ ", lifestyle=" + lifestyle + ", workPay=" + workPay + ", zipcode=" + zipcode + ", createdAt="
				+ createdAt + ", cityCustom=" + cityCustom + ", phoneCountryCode=" + phoneCountryCode + ", phone="
				+ phone + ", additionalPersonalInformation=" + additionalPersonalInformation + ", name=" + name
				+ ", id=" + id + ", family=" + family + ", email=" + email + ", age=" + age + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
