package com.instancemeth;

public class Example1 {
	String studentName;
	int studentId;
	String branchName;
	
	public void getDetails() {
//		System.out.println("invoking");
		System.out.println(hashCode());
	}

	public static void main(String[] args) {
		
		Example1 obj1=new Example1();
//		obj1.studentId=34;
//		obj1.studentName="Balaraj";
//		obj1.branchName="CSE";
//		
		obj1.getDetails();
		
		
		System.out.println(obj1.hashCode());

	}

}
