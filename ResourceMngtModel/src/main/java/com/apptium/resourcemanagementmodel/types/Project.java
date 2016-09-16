package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;
import java.util.Calendar;

/**
 * @author ayadav001c
 *
 */
public class Project implements Serializable {

	private static final long serialVersionUID = -5266960453552604091L;

	private String projectName;

	private String projectDescription;

	private PeriodOfAvailability periodOfAvailability;

	private Company company;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public PeriodOfAvailability getPeriodOfAvailability() {
		return periodOfAvailability;
	}

	public void setPeriodOfAvailability(PeriodOfAvailability periodOfAvailability) {
		this.periodOfAvailability = periodOfAvailability;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Project(String projectName, String projectDescription, PeriodOfAvailability periodOfAvailability,
			Company company) {
		super();
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.periodOfAvailability = periodOfAvailability;
		this.company = company;
	}



}
