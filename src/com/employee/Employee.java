package com.employee;

public class Employee {
	
	
	private int empId;
	private String empName;
	private String empDesg;
	private double empSalary;
	private int performanceRating;
	
	public Employee(int empId, String empName, String empDesg, double empSalary,
			int performanceRating) {
		this.empId=empId;
		this.empName=empName;
		this.empDesg=empDesg;
		this.empSalary=empSalary;
		this.performanceRating=performanceRating;
		
	}
	
	//Getters

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}
	
	//setters

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	
	//BLC
	public void promoteEmployee(String empDesg) {
		if(performanceRating >=4) {
			empSalary +=empSalary*0.2;
			this.empDesg=empDesg;
			System.out.println("Employee pramoted");
		}else {
			System.out.println("Employee not pramoted");
		}
	}

	
	
	

}
