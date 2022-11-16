package com.java.giftshop.service;

public interface User {
	 void createCustomerAccount();
	 void createStaffAccount();
	 void login();
	 int deleteCustomer(Integer id);
	 void deleteStaff(Integer sid);
	 void listOfCustomers();
	 void listOfStaff();
}
