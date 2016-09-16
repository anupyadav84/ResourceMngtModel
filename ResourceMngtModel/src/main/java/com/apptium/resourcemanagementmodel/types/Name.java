package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;

/**
 * @author ayadav001c
 *
 */
public class Name implements Serializable{
	
	private static final long serialVersionUID = -872842320257610228L;
	private String firstName;
	private String lastName;
	
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

}
