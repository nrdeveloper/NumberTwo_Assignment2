package com.csis3275.models_numbertwo_group;

public class Student_Model {
	private String name;
	private String description;
	
	public Student_Model() {};
	
	public Student_Model(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
