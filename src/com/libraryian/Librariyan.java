package com.libraryian;

public class Librariyan {
	private String libraryianName;
	private int id;
	
	//getters
	public String getLibraryianName() {
		return libraryianName;
	}
	public int getId() {
		return id;
	}
	
	//setters
	
	public void setLibraryianName(String libraryianName) {
		this.libraryianName = libraryianName;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void showDetails() {
		System.out.println("Libraryian Name : "+ libraryianName);
		System.out.println("Libraryian Id : "+ id);
	}
	
	
	
	
	

}
