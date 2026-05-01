package com.operatores;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		     Scanner sc=new Scanner(System.in);
		     int attempt=0;
		     do {
		    	 System.out.println("Enter User Name  : ");
		    	 String username=sc.nextLine();
		    	 System.out.println("Enter passowrd : ");
		    	 String password=sc.nextLine();
		    	 if(username.equals("abcdef")&& password.equals("abcdef@#")) {
		    		 System.out.println("login successfully");
		    		 break;
		    		 
		    	 }else {
		    		 attempt++;
		    		 System.out.println("you have "+attempt+"completed");
		    	 }
				
			} while (attempt < 3);
		     
		     System.out.println("your attempt has been completed try after 24 hr laterS");
		     
		     sc.close();
		     
		     

	}

}
