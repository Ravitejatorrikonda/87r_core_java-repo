package com.arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size of an array : ");
	int size=sc.nextInt();
	int [] arr=new int[size];
//	System.out.println(Arrays.toString(arr));
	
	for (int i = 0; i < size; i++) {
		System.out.println("enter"+i+"index value : ");
		int ele=sc.nextInt();
		arr[i]=ele;
	}
	System.out.println(Arrays.toString(arr));
	
	sc.close();

	}

}
