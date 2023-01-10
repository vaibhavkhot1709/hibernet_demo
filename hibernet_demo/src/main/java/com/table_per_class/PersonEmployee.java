package com.table_per_class;

import javax.persistence.Entity;

@Entity
public class PersonEmployee extends Person {

	String depart;
	double salary;

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
