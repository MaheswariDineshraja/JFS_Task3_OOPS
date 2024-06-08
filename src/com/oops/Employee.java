package com.oops;

//class employee with empid, name,salary
public class Employee implements Taxable {
	
	// Data members of Employee Class
	private int empid;
	private String name;
	private double salary;	
	
	// Constructor of Employee Class
	public Employee(int empID, String name, double salary) {
		// TODO Auto-generated constructor stub
		this.empid=empID;
		this.name=name;
		this.salary=salary;
	}
	
	// Abstract Method of Taxable class to calculate 10.5% tax from yearly salary.
	public double calcTax(double amount){		
		return amount*incomeTax;		
	}
	
}