package com.arrays;

import java.util.Scanner;

public interface UtilityArray {
	public static int[] toarray() {
		
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Size of an array : ");
	   int size=sc.nextInt();
		if(size <=0) {
			sc.close();
			return null;
		}else {
			int [] arr=new int[size];
			for (int i = 0; i < size; i++) {
				System.out.println("Enter "+i+"inde value : ");
				arr[i]=sc.nextInt();
			}
			return arr;
		}
	}

}
