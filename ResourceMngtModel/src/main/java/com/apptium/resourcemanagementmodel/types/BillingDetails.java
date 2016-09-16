package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author ayadav001c
 *
 */
public class BillingDetails implements Serializable {

	private static final long serialVersionUID = -8118961229962348270L;

	private Boolean isBillable;

	private BigDecimal billingRate;
	
	private BillingStatus billingStatus;

	public BillingDetails(Boolean isBillable, BigDecimal billingRate, BillingStatus billingStatus) {
		super();
		this.isBillable = isBillable;
		this.billingRate = billingRate;
		this.billingStatus = billingStatus;
	}

	public BillingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boolean getIsBillable() {
		return isBillable;
	}

	public void setIsBillable(Boolean isBillable) {
		this.isBillable = isBillable;
	}

	public BigDecimal getBillingRate() {
		return billingRate;
	}

	public void setBillingRate(BigDecimal billingRate) {
		this.billingRate = billingRate;
	}

	public BillingStatus getBillingStatus() {
		return billingStatus;
	}

	public void setBillingStatus(BillingStatus billingStatus) {
		this.billingStatus = billingStatus;
	}



}
