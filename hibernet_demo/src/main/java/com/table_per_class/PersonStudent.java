package com.table_per_class;

import javax.persistence.Entity;

@Entity
public class PersonStudent extends Person {

	String sclool_nm;

	public String getSclool_nm() {
		return sclool_nm;
	}

	public void setSclool_nm(String sclool_nm) {
		this.sclool_nm = sclool_nm;
	}

}
