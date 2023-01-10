package com.single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PartTime")
public class PartTimeEmp extends Employee {

	String PtEmpNm;
	double salPerHr;

	public String getPtEmpNm() {
		return PtEmpNm;
	}

	public void setPtEmpNm(String ptEmpNm) {
		PtEmpNm = ptEmpNm;
	}

	public double getSalPerHr() {
		return salPerHr;
	}

	public void setSalPerHr(double salPerHr) {
		this.salPerHr = salPerHr;
	}

}
