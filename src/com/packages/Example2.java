package com.packages;

import java.util.Scanner;

public class Example2 {

	public void getData(String name, String adress, double salary, int id) {
		System.out.println("Emp Name : " + name);
		System.out.println("Emp adress : " + adress);
		System.out.println("Emp salary : " + salary);
		System.out.println("Emp id : " + id);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empName : ");
		String name=sc.nextLine();
		System.out.println("Enter empAdress : ");
		String adress=sc.nextLine();
		System.out.println("Enter empSalary : ");
		double salary=sc.nextDouble();
		System.out.println("Enter empId : ");
		int id=sc.nextInt();
		
		new Example2().getData(name, adress, salary, id);
		
		
		
		sc.close();

	}

}
