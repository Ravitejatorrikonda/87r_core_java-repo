
package com.arrays;

import java.util.Arrays;

import java.util.Scanner;


public class Example4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an array : ");
		int size=sc.nextInt();
		if(size < 0 && size >5) {
			System.out.println("Invalid size ........");
		}else {
			String[] str=new String[size];
			sc.nextLine();
			for (int i = 0; i < size; i++) {
				System.out.println("Enter "+i+"index value : ");
				str[i]=sc.nextLine();
			}
			System.out.println(Arrays.toString(str));
		}
		
		
		
		
		sc.close();

	}

}
