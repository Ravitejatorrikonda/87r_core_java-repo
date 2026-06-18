package com.exception.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Example10 {
	public void order() throws Exception {
		throw new Exception();
	}

	public static int getData() {
		try {
			return 100;
		} finally {
			return 200;
		}

	}

	public void printData() {
		try {
			try {
				throw new RuntimeException("this is runtime....");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} finally {
			System.out.println("this is finally ....");
		}

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value : ");
		

		new Example10().printData();

		System.out.println(getData());

		try {
			
			new Example10().order();
			System.out.println("this is try block....");
		} catch (Exception e) {
			System.out.println("This is catch block...");
		} finally {
			sc.close();
			System.out.println("this is finally block..");
		}
	
	}

}
