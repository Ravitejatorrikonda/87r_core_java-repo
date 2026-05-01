package com.instancemeth;

public class Example3 {
	
	String empName;
	String empDesg;
	double empSalary;
	public void getDetails(String name, String Desg, double Salary) {
		
		empName=name;
		empDesg=Desg;
		empSalary=Salary;
		
	}
	
	public String printDetails() {
		return "Employee Name : "+empName+"\n Employee Desg : "+empDesg+"\n Employee Salary : "+empSalary;
	}
	

	

	public static void main(String[] args) {
		Example3 obj1=new Example3();
		obj1.empName="Aishwarya";
		obj1.empDesg="SD";
		obj1.empSalary=80000.0;
		
		obj1.getDetails("Raju","SE",70000.0);
		System.out.println(obj1.empName);
		System.out.println(obj1.empDesg);
		System.out.println(obj1.empSalary);
		System.out.println("----------------------");
		
		String result=obj1.printDetails();
		System.out.println(result);

	}

}
