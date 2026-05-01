package com.elc.blc;

public class Employee {
	
	public String empname;
	public String empDesg;
	public int empSalary;
	//setters
	public void setEmpname(String name) {
		empname = name;
	}
	public void setEmpDesg(String Desg) {
		empDesg = Desg;
	}
	public void setEmpSalary(int Salary) {
		empSalary = Salary;
	}
	
	//getters
	
	public String getEmpname() {
		return empname;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	
//	public String empDetails() {
//		return "Employee Name "+empname+" \n Employee Desgination : "+empDesg+"\n Employee Salary : "+empSalary;
//	}
	
	
	public static Employee displayDetails() {
		Employee emp=new Employee();
		
		return emp;
	}
	
	
	
	

}
