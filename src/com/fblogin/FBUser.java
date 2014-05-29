package com.fblogin;

public class FBUser {

	private String id;
	private String name;
	private String lastName;
	private String firstName;
	private String email;
	private String birthday;

	public FBUser(String id, String name, String lastName, String firstName,
			String email, String birthday) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.birthday = birthday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
