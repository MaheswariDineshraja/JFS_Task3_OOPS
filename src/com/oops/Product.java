package com.oops;

//class product with pid,price,quantity
public class Product implements Taxable
{
	private int pid;
	private double price;
	private int quantity;
	
	
	public Product(int pid, double price, int quantity) {
		// TODO Auto-generated constructor stub
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
		
	// calculate salesTax on unit price of product
	public double calcTax(double amount){		
		return amount*salesTax;		
	}
	
}
