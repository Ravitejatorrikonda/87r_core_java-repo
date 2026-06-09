package com.anonymous.example;

import java.util.Arrays;

interface Parent{
	int[] sortarr();
}

public class Vehicle {

	public static void main(String[] args) {
		int [] arr= {5,3,2,4,1};
		
		
		Parent p=new Parent() {
			
			@Override
			public int[] sortarr() {
				Arrays.sort(arr);
				return arr;
			}
		};
		System.out.println(Arrays.toString(p.sortarr()));

	}

}
