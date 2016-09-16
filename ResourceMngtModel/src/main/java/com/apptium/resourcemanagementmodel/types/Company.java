package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;

/**
 * @author ayadav001c
 *
 */
public class Company implements Serializable {

	private static final long serialVersionUID = 1357123856933710156L;

	private String companyName;

	private String companyDetails;

	private Address address;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(String companyDetails) {
		this.companyDetails = companyDetails;
	}

	public Company(String companyName, String companyDetails, Address address) {
		super();
		this.companyName = companyName;
		this.companyDetails = companyDetails;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



}
