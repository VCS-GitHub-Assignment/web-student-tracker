package com.luv2code.web.jdbc;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	
	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public Student(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstNames;
	}


	public void setFirstName(String firstName) {
		this.firstNames = firstName;
	}


	public String getLastName() {
		return lastNames;
	}


	public void setLastName(String lastName) {
		this.lastNames = lastNames;
	}


	public String getEmail() {
		return emails;
	}


	public void setEmail(String email) {
		this.emails = emails;
	}


	@Override
	public String toString() {
		return "Student [ids=" + id + ", firstNames=" + firstNames + ", lastNamse=" + lastNames + ", emails=" + emails + "]";
	}
	

}
