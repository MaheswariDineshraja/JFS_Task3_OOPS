package com.oops;

import java.util.Scanner;
import java.util.ArrayList;


public class BookManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Book Book;
		
		System.out.print("Enter the Total number of books to be add into library: ");
		int totalnobooks = scanner.nextInt();
		Library library = new Library(totalnobooks);
		System.out.print("Enter the number number of books to be add now: ");
		int addbooksnow = scanner.nextInt();
				
		for (int i = 0; i < addbooksnow; i++) {
			System.out.println("Enter Book ID, Title, Author & availability for the product" + (i+1)+":");
			int bookid = scanner.nextInt();
			String title = scanner.next();
			String author = scanner.next();
			boolean isAvailable = scanner.nextBoolean();
			Book book = new Book(bookid, title, author, isAvailable);
			library.addBook(book);   
		}  
		
		// Selection options to allow users to choose any menu to perform
		int selectoptions;
		do {
			System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Replace Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your Selection: ");
            selectoptions = scanner.nextInt();
            
            switch (selectoptions) {
            	case 1:
	                System.out.print("Enter details for the new book:\n");
	                System.out.print("Book ID: ");
	                int bookid = scanner.nextInt();
	                scanner.nextLine(); // Consume newline
	                System.out.print("Book Title: ");
	                String title = scanner.nextLine();
	                System.out.print("Book Author: ");
	                String author = scanner.nextLine();
	                System.out.print("Is the book available: ");
	                boolean isAvailable = scanner.nextBoolean();
	
	                Book = new Book(bookid, title, author, isAvailable);
	                library.addBook(Book);
                break;
            	case 2:
	                System.out.print("Enter the ID of the book to replace: ");
	                int removeID = scanner.nextInt();
	                library.replaceBook(removeID);
                break;
            	case 3:
	                library.displayBooks();
                break;
            	case 4:
            		System.out.println("Exiting...");
                break;
            	default:
            		System.out.println("Invalid choice. Please try again.");
            
            }
		} while (selectoptions !=4);
        		   
		scanner.close();
        
        
	}

}
