package com.fdm.data;



public class User{
	
	private int userID;
	private String userName;
	protected String password;
	private String firstName;
	private String LastName;
	private String email;
	protected String role;
	private String status;
	
	
	public User() {
		super();
	}
	
	public User(int userID2, String userName2) {
		super();
	}
	
	
	public User(int userID, String userName, String password, String firstName, String lastName, String email,
			String role, String status) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.LastName = lastName;
		this.email = email;
		this.role = role;
		this.status = status;
	}


	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

	
	

	

}
