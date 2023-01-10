package com.joined;

import javax.persistence.Entity;

@Entity
public class Fruits extends Garden {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
