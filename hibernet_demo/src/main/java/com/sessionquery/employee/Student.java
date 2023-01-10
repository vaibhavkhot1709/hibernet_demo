package com.sessionquery.employee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "session_Student")
@DiscriminatorValue("Std")
public class Student extends Person {

	String prsnt_class;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPrsnt_class() {
		return prsnt_class;
	}

	public void setPrsnt_class(String prsnt_class) {
		this.prsnt_class = prsnt_class;
	}

	@Override
	public String toString() {
		return "Student [prsnt_class=" + prsnt_class + ", id=" + id + ", age=" + age + ", nm=" + nm + "]";
	}
}
