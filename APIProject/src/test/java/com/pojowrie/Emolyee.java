package com.pojowrie;

import java.util.ArrayList;

public class Emolyee {

	private String name;
	private String emailid;
	private long phoneno;
	public ArrayList<Address> employee;

	public Emolyee(String name, String emailid, long phoneno, ArrayList<Address> employee) {
		this.name = name;
		this.emailid = emailid;
		this.phoneno = phoneno;
		this.employee = employee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public ArrayList<Address> getEmployee() {
		return employee;
	}
	public void setEmployee(ArrayList<Address> employee) {
		this.employee = employee;
	}




}
