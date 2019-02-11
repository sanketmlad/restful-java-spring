package com.example.rest.webservices.restfulwebservies.versioning;

public class PersonV2 {

	private Name name;


	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public PersonV2(Name name) {
		super();
		this.name = name;
	}


	public PersonV2() {
		super();
	}
}
