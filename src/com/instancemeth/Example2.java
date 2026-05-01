package com.instancemeth;

public class Example2 {
	
	String empName;
	String empDesg;
	long empSalary;
	public void getDetails() {
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Designation : "+empDesg);
		System.out.println("Employee Salary : "+ empSalary);
	}

	public static void main(String[] args) {
		Example2 obj1=new Example2();
		Example2 obj2=new Example2();
		obj1.empName="Venkat";
		obj1.empDesg="SD";
		obj1.empSalary=450000;
		obj1.getDetails();
		System.out.println("-----------------");
		
		obj2.empName="Venkat mohan";
		obj2.empDesg="SE";
		obj2.empSalary=50000;
		obj2.getDetails();
		
		

	}

}
