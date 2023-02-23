package com.hibernet_demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Details")
public class Employee {

	@Id
	int id;
	String nm;
	String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String nm, String address) {
		super();
		this.id = id;
		this.nm = nm;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nm=" + nm + ", address=" + address + "]";
	}

}
