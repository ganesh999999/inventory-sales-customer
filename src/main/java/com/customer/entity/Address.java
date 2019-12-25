package com.customer.entity;

public class Address {

	private String customerId;
	private String street;
	private String colony;
	private String city;
	private String state;
	private int zip;
	private String country;

	public Address() {
//no code
	}

	public Address(String customerId, String street, String colony, String city, String state, int zip,
			String country) {
		super();
		this.customerId = customerId;
		this.street = street;
		this.colony = colony;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [customerId=" + customerId + ", street=" + street + ", colony=" + colony + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}

}
