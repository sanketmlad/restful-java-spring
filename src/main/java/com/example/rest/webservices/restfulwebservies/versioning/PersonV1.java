package com.example.rest.webservices.restfulwebservies.versioning;

public class PersonV1 {

	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public PersonV1(String name) {
		super();
		Name = name;
	}

	public PersonV1() {
		super();
	}

}
