package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;

/**
 * @author ayadav001c
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 9082731399186335109L;

	private Name name;

	private String expertiseLevel;

	private String skillSet;

	private Address address;

	private String employeeID;

	private EmployeeType employeeType;

	public User() {
		super();

	}

	public User(Name name, String expertiseLevel, String skillSet, Address address,
			String employeeID, EmployeeType employeeType) {
		super();
		this.name = name;
		this.expertiseLevel = expertiseLevel;
		this.skillSet = skillSet;
		this.address = address;
		this.employeeID = employeeID;
		this.employeeType = employeeType;
	}
	
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getExpertiseLevel() {
		return expertiseLevel;
	}

	public void setExpertiseLevel(String expertiseLevel) {
		this.expertiseLevel = expertiseLevel;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
}
