package com.library;

public class Library {
	private String libraryName;
	private int books;
	
	//Getters
	public String getLibraryName() {
		return libraryName;
	}
	public int getBooks() {
		return books;
	}
	
	//Setters
	
	public void setLibraryName(String libraryName) {
		this.libraryName=libraryName;
	}
	public void setBooks(int books) {
		this.books=books;
		
	}
	
	
	public void showLibararyDetails() {
		System.out.println("Library Name : "+libraryName);
		System.out.println("Library No of books : "+books);
	}

}
