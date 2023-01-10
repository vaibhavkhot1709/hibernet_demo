package com.sessionquery.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String nm;
	double avg;
	String Company_nm;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getCompany_nm() {
		return Company_nm;
	}
	public void setCompany_nm(String company_nm) {
		Company_nm = company_nm;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", nm=" + nm + ", avg=" + avg + ", Company_nm=" + Company_nm + "]";
	}
	
	
}
