package com.csis3275.models_numbertwo_group;

public class Student_Model {
	private String photo;
	private String description;
	
	public Student_Model() {};
	
	public Student_Model(String photo, String description) {
		this.photo = photo;
		this.description = description;
	}
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
