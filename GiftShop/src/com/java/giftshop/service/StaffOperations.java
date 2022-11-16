package com.java.giftshop.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StaffOperations extends Staff implements User{

	public StaffOperations(Integer sid, String username, String password, int phoneNumber, String email,
			String address) {
		super(sid, username, password, phoneNumber, email, address);
		// TODO Auto-generated constructor stub
	}
	
	Customer customer;
	List<Customer> list = new ArrayList<Customer>();

	@Override
	public void createCustomerAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createStaffAccount() {
		System.out.println("Sorry you don't have access to it");
		
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
			System.out.println("Please Enter correct Credentials");
		}
		
	}

	@Override
	public int deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteStaff(Integer sid) {
		System.out.println("Sorry you don't have access to it");
		
	}

	@Override
	public void listOfCustomers() {
		list.stream().sorted(new sortByName()).forEach(System.out::println);
		
	}

	@Override
	public void listOfStaff() {
		System.out.println("Sorry You don't have access to it");
		
	}

	
	class sortByName implements Comparator<Customer>{

		@Override
		public int compare(Customer o1, Customer o2) {
			// TODO Auto-generated method stub
			return o1.getUsername().compareTo(o2.getUsername());
		}

	}
}
