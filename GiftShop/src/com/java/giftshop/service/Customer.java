package com.java.giftshop.service;

public class Customer implements User,CustomerOperations{
	private Integer id;
	private String username;
	private String password;
	private int phone;
	private String email;
	private String address;
	
	
	
	public Customer(Integer id,String username, String password, int phone, String email,
			String address) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	public void makeOrder() {
		
		
	}

	public void payment() {
		// TODO Auto-generated method stub
		
	}

	public void getInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCustomerAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createStaffAccount() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteStaff(Integer sid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteCustomer(Integer id) {
		return id;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listOfCustomers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listOfStaff() {
		// TODO Auto-generated method stub
		
	}



}
