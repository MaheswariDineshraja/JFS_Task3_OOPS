package com.oops;

class Book
{
	//attributes
	private int bookID;
	private String title;
	private String author;
	private boolean isAvailable;
	
	
	//constructor to initialize book attributes
	public Book(int bookid, String title, String author, boolean isAvailable)
	{
		this.bookID=bookid;
		this.title=title;
		this.author=author;
		this.isAvailable=isAvailable;
	}
	
	//Getter and Setter methods for book attributes
	public int getbookID(){
		return bookID;
	}
	
	public void setbookID(int bookid){
		this.bookID= bookid;
	}
	
	public String gettitle(){
		return title;
	}
	
	public void settitle(String title){
		this.title= title;
	}
	
	public String getauthor(){
		return author;
	}
	
	public void setauthor(String author){
		this.author= author;
	}
	
	public boolean getisAvailable(){
		return isAvailable;
	}
	
	public void setisAvailable(boolean isAvailable){
		this.isAvailable= isAvailable;
	}
	
	
    public String toString() {
        return "Book{" +
                "bookId=" + bookID +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
	
}