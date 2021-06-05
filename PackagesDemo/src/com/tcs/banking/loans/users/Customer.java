package com.tcs.banking.loans.users;

import com.tcs.banking.loans.insurance.LifeInsurance;

class Person {
	public int person_id;
	protected String person_name;
}

public class Customer {
	
	public int id;
	public String name;
	
	public static void main(String[] args) {
		LifeInsurance obj = new LifeInsurance();
		obj.showInsuranceDetails();
	}
}
