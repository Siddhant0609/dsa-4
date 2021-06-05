package com.tcs.banking.loans.credit;

import com.tcs.banking.loans.users.Customer;

public class CreditCustomer extends Customer {
	void showDetails() {
		
		Customer obj = new Customer();
		System.out.println("Id is : " + obj.id);
		System.out.println("Name is : " + obj.name);
		
		System.out.println("Id is : " + id);
		System.out.println("Name is : " + name);
	}
}
