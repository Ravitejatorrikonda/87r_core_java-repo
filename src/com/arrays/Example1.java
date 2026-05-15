package com.arrays;

public class Example1 {

	public static void main(String[] args) {
		//datatype [] arrreff=new datatype[size];
		
		int[] arr=new int[5];//     arr=[0,0,0,0,0]
		System.out.println("Zero Index value : "+arr[0]);
		System.out.println("First Index value : "+arr[1]);
		System.out.println("Sec Index value : "+arr[2]);
		System.out.println("Thi Index value : "+arr[3]);
		System.out.println("four Index value : "+arr[4]);
		System.out.println("-----------------------------");
		
		   arr[0]=34;
		   arr[4]=43;
		   
		   System.out.println("Zero Index value : "+arr[0]);
			System.out.println("First Index value : "+arr[1]);
			System.out.println("Sec Index value : "+arr[2]);
			System.out.println("Thi Index value : "+arr[3]);
			System.out.println("four Index value : "+arr[4]);
			System.out.println("-------------------------------");
			System.out.println(arr.length);

	}

}
