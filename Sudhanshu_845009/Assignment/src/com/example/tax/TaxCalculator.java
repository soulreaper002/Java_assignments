package com.example.tax;

public class TaxCalculator {
	float basicSalary, tax;
	boolean citizenship;
	int nettSalary;
	void calculateTax() {
		this.tax=(30*basicSalary)/100;
		System.out.println("The Tax of the employee  for  the  "+ basicSalary+" is " +tax);	
	}
	void deductTax() {
		int tax_method = (int)(basicSalary-tax);
		this.nettSalary = tax_method;
		System.out.println("The nett salary of the employee "+ nettSalary);
	}
	void validateSalary() {
		boolean response;
		if(citizenship==true && basicSalary>100000) {
					
					response=true;
										}
		else {
			response=false;
		}
		System.out.println(" The salary and citizenship eligibility: "+ response);
	}
	
}
