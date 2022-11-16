package com.java.giftshop.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manager implements User{
	
	Customer customer;
	List<Customer> list = new ArrayList<Customer>();
	
	Staff staff;
	List<Staff> slist = new ArrayList<Staff>();
	
	@Override
	public void createCustomerAccount() {
		Integer id;
		String username, password;
		int phone;
		String email,address;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		id = sc.nextInt();
		System.out.println("Enter username");
		username = sc.nextLine();
		System.out.println("Enter password");
		password = sc.nextLine();
		System.out.println("Enter phone number");
		phone = sc.nextInt();
		System.out.println("Enter email id");
		email = sc.nextLine();
		System.out.println("Enter address");
		address = sc.nextLine();
		if(list.add(new Customer(id,username,password,phone,email,address))) {
			System.out.println("Customer Registered Successfully");
		}else {
			System.out.println("Failed to insert the Customer Record");
		}
		
	}


	@Override
	public void login() {
		String username;
		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		username = sc.nextLine();
		System.out.println("Enter password");
		password = sc.nextLine();
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			
		}else {
			System.out.println("Please enter correct UserName and Password");
		}
		
		
	}

	@Override
	public void createStaffAccount() {
		Integer sid;
		String username, password;
		int phoneNumber;
		String email,address;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Staff id");
		sid = sc.nextInt();
		System.out.println("Enter username");
		username = sc.nextLine();
		System.out.println("Enter password");
		password = sc.nextLine();
		System.out.println("Enter phone number");
		phoneNumber = sc.nextInt();
		System.out.println("Enter email id");
		email = sc.nextLine();
		System.out.println("Enter address");
		address = sc.nextLine();
		if(slist.add(new Staff(sid,username,password,phoneNumber,email,address))) {
			System.out.println("Staff Registered Successfully");
		}else {
			System.out.println("Failed to insert the Staff Record");
		}
		
	}


	public int deleteCustomer(Integer id) {
		if(list.removeIf(customer->customer.getId().equals(id))) {
			return 1;
		}else {
			return -1;
		}
		
	}


	@Override
	public void deleteStaff(Integer sid) {
		if(slist.removeIf(staff->staff.getSid().equals(sid))) {
			System.out.println("Staff deleted successfully");
		}else {
			System.out.println("Please check the staff id");
		}
		
	}


	@Override
	public void listOfCustomers() {
		list.stream().sorted(new sortByName()).forEach(System.out::println);
		
	}
	
	@Override
	public void listOfStaff() {
		Comparator<Staff> sortByUserName = new Comparator<Staff>() {

			@Override
			public int compare(Staff o1, Staff o2) {
				// TODO Auto-generated method stub
				return o1.getUsername().compareTo(o2.getUsername());
			}
			
		};
		Collections.sort(slist,sortByUserName);
		slist.forEach(System.out::println);
	
		
	}

	
	
	
class sortByName implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getUsername().compareTo(o2.getUsername());
	}

}




}
