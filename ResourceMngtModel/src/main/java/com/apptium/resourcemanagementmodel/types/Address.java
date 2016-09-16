package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;

/**
 * @author ayadav001c
 *
 */
public class Address implements Serializable {

	private static final long serialVersionUID = 3767664121756607673L;

	private String streetAddress1;

	private String streetAddress2;

	private String unitNumber;

	private String unitType;

	private String city;

	private String zipCode;

	private String country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(String streetAddress1, String streetAddress2, String unitNumber, String unitType, String city,
			String zipCode, String country) {
		super();
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.unitNumber = unitNumber;
		this.unitType = unitType;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}



}
