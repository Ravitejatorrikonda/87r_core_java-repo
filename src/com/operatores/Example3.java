package com.operatores;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter gender : ");
		String gender=sc.nextLine();
		
		if((age == 23)&& gender.equals("female") || (age >= 25 && gender.equals("male"))) {
			System.out.println("Eligible ");
		}else {
			System.out.println("! eligible");
		}
		
		
		
		sc.close();

	}

}
