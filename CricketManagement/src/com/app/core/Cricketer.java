package com.app.core;

import java.util.Objects;

public class Cricketer {
	private String name;
	private int age;
	private String email;
	private String phoneno;
	private int rating;
	public Cricketer(String name, int age, String email, String phoneno, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneno = phoneno;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", email=" + email + ", phoneno=" + phoneno + ", rating="
				+ rating + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cricketer other = (Cricketer) obj;
		return Objects.equals(email, other.email);
	}
	
	 
	

}
