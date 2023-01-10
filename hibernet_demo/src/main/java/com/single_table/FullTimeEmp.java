package com.single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FullTime")
public class FullTimeEmp extends Employee{
	
	String FtEmpnm;
	double salaryFt;

	public double getSalaryFt() {
		return salaryFt;
	}

	public void setSalaryFt(double salaryFt) {
		this.salaryFt = salaryFt;
	}

	public String getFtEmpnm() {
		return FtEmpnm;
	}

	public void setFtEmpnm(String ftEmpnm) {
		FtEmpnm = ftEmpnm;
	}
	
	

}
