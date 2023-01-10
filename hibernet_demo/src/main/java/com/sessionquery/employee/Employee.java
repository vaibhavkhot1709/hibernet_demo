package com.sessionquery.employee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Session_Employee")
@DiscriminatorValue(value ="Emp")
public class Employee extends Person {
	
	String department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", id=" + id + ", age=" + age + ", nm=" + nm + "]";
	}
	
	
}
