package com.java.giftshop.service;

import java.util.Scanner;

public class CustomerOperations extends Customer implements User{

	public CustomerOperations(Integer id, String username, String password, int phone, String email, String address) {
		super(id, username, password, phone, email, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void login() {
		String user;
		String pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		user = sc.nextLine();
		System.out.println("Enter password");
		pass = sc.nextLine();
		if(user.equalsIgnoreCase(getUsername()) && pass.equalsIgnoreCase(getPassword())) {
			
		}else {
			System.out.println("Enter vaild Credentials");
		}
		
	}

	@Override
	public void createCustomerAccount() {
		System.out.println("Sorry you don't have access to it");
		
	}

	@Override
	public void createStaffAccount() {
		System.out.println("Sorry you don't have access to it");
		
	}



	@Override
	public void deleteStaff(Integer sid) {
		System.out.println("Sorry you don't have access to it");
		
	}

	@Override
	public int deleteCustomer(Integer id) {
		return 0;
		
		
	}

	@Override
	public void listOfCustomers() {
		System.out.println("Sorry you don't have access to it");
		
	}

	@Override
	public void listOfStaff() {
		System.out.println("Sorry you don't have access to it");
		
	}


}
