package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;
import java.util.Calendar;

public class PeriodOfAvailability implements Serializable{

	private static final long serialVersionUID = 3304148095257721557L;
	private Calendar startDate;
	private Calendar endDate;
	
	public PeriodOfAvailability() {
		super();
	}

	public PeriodOfAvailability(Calendar startDate, Calendar endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	
	

}
