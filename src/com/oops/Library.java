package com.oops;

import java.util.Scanner;

class Library{
	
	//Array of object of class Book
	private Book[] books;	
	//Total number books to add
	private int totalnobooks;
	//books to add
	private int addbooksnow;
	
	
	// constructor of library class
	public Library(int totalnobooks){
		this.totalnobooks = totalnobooks;
		this.books=new Book[totalnobooks];
		this.addbooksnow=0;
		
	}
	
	//Method to add a book to the library
	public void addBook(Book book1)
	{
		//Add the book to the books array	
		for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book1;
                System.out.println("Book added at index " + i + ": " + book1);
                return;
            }
        }
		
	}
	
	//method to replace a book from the library
	public void replaceBook(int bookID)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details for the new book:");
		
		System.out.print("Title: ");
        String newTitle = scanner.nextLine();

        System.out.print("Author: ");
        String newAuthor = scanner.nextLine();
        
        System.out.print("Is the book available?: ");   
        boolean isAvailable1 = scanner.nextBoolean();

        
        Book newBook = new Book(bookID, newTitle, newAuthor, isAvailable1);   
        //boolean bookFound = false;
        for (int i = 0; i < books.length; i++) {
        if(books[i] != null && books[i].getbookID() == bookID)
          {
        	Book newBook1 = new Book(bookID, newTitle,newAuthor, isAvailable1);
            books[i] = newBook1; 
            System.out.println("Book at index " + bookID + " replaced with: " + newBook);
            //bookFound = true;
            break;
          }
        }
		
	}
	
	//Method to display all books in the library
	public void displayBooks() {
		System.out.println("\nDetails of the books in the library:");
        for (int i = 0; i < books.length; i++) {
        	if (books[i] != null) {
        		// Displaying Employee Information.
                System.out.println("Book ID: " + books[i].getbookID());
                System.out.println("Book Title: " + books[i].gettitle());
                System.out.println("Book Author: " + books[i].getauthor());
                System.out.println("Book Availablility: " + books[i].getisAvailable() + "\r\n");
                
        	}     		       		
            
        }
		
	}
	
	
}