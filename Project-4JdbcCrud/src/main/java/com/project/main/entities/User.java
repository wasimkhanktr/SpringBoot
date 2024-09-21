package com.project.main.entities;

public class User 
{
	private String name;
	private String email;
	private String gender;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public User(String name, String email, String gender, String city) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.city = city;
	}
	

}
