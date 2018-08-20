package com.prud.model.middleware;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClientJpathModel {

	@Value("${client.birthPlace}")
	private String city;
	@Value("${client.address}")
	private String address;
	@Value("${client.zipcode}")
	private String zipcode;
	@Value("${client.phone}")
	private String phone;
	@Value("${client.gender}")
	private String gender;
	@Value("${client.countryCode}")
	private String countryCode;
	@Value("${client.firstName}")
	private String firstName;
	@Value("${client.lastName}")
	private String lastName;
	@Value("${client.civilStatus}")
	private String status;
	@Value("${client.nationality}")
	private String nationality;
	@Value("${client.occupationCode}")
	private String occupationCode;
	@Value("${client.salutation}")
	private String salutation;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getOccupationCode() {
		return occupationCode;
	}

	public void setOccupationCode(String occupationCode) {
		this.occupationCode = occupationCode;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

}
