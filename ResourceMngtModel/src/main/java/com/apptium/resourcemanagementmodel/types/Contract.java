package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;
import java.sql.Blob;

public class Contract implements Serializable {

	private static final long serialVersionUID = 6184489169880032411L;
	private String contractName;
	private String contractDescription;
	private Blob contractBlob;
	private Company companyName;

	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract(String contractName, String contractDescription, Blob contractBlob, Company companyName) {
		super();
		this.contractName = contractName;
		this.contractDescription = contractDescription;
		this.contractBlob = contractBlob;
		this.companyName = companyName;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractDescription() {
		return contractDescription;
	}

	public void setContractDescription(String contractDescription) {
		this.contractDescription = contractDescription;
	}

	public Blob getContractBlob() {
		return contractBlob;
	}

	public void setContractBlob(Blob contractBlob) {
		this.contractBlob = contractBlob;
	}

	public Company getCompanyName() {
		return companyName;
	}

	public void setCompanyName(Company companyName) {
		this.companyName = companyName;
	}
}
