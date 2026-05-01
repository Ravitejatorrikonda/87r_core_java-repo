package com.libraryDetails;

import com.library.Library;
import com.libraryian.Librariyan;

public class Main {

	public static void main(String[] args) {
		Library li1=new Library();
		Librariyan li2=new Librariyan();
		li1.setLibraryName("Gandhi");
		li1.setBooks(500);
		
		li2.setLibraryianName("Rahul");
		li2.setId(34);
		
		li1.showLibararyDetails();
		li2.showDetails();

	}

}
