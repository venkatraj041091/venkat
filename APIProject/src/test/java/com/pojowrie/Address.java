package com.pojowrie;

public class Address {
	
	
	private String firstname;
	private String course;
	private String address;
	public Address(String firstname, String course, String address) {
		
		this.firstname = firstname;
		this.course = course;
		this.address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
