package com.oops;

import java.util.Scanner;

public class DriverMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter employee id: ");
		int empID = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee name: ");
		String name = scanner.nextLine();
		System.out.print("Enter employee salary:$ ");
        double salary = scanner.nextDouble();
                
        // Object of Employee class
        Employee employee = new Employee(empID,name,salary);
        
        // Displaying Employee Information.
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("Yearly Tax: $" + employee.calcTax(salary));
        
        System.out.println("Enter product id: ");
		int pid = scanner.nextInt();
		System.out.println("Enter Product price: ");
		double price = scanner.nextDouble();
		System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        
        // object of Product Class
        Product product = new Product(pid,price,quantity);  
        
        // Displaying product Information.
        System.out.println("Product ID: " + pid);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Sales Tax per unit: $" + product.calcTax(price));
        
        scanner.close();
	
	}

}
