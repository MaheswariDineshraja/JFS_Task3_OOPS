package com.oops;

public interface Taxable {
	
	// Interface Taxable with members SalesTax and incomeTax
	final double salesTax=0.07;
	final double incomeTax=0.105;
	
	// abstract method 
	abstract double calcTax(double amount);
	
}
