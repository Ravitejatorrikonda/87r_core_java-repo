package com.anonymouss;

import java.util.Arrays;

@FunctionalInterface
interface Sorter{
	abstract int[] getSorter(int [] arr);
}


public class Example4 {

	public static void main(String[] args) {
		int [] arr= {1,3,4,2,6,9,8,7};
		
		Sorter s=new Sorter() {
			public int[] getSorter(int [] arr) {
				
				
				for (int i = 0; i < arr.length; i++) {
				  for (int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						}
				}	
				}
				
//				Arrays.sort(arr);
				return arr;
			}
			
		};
	System.out.println(	Arrays.toString(s.getSorter(arr)));

	}

}
