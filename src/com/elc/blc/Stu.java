package com.elc.blc;

public class Stu {

	public String stName;
	public String Branch;
	public int rollNo;

//setters
	public void setName(String name, String Bran) {
		stName = name;
		Branch=Bran;
	}

//	public void setBranch(String bran) {
//		Branch = bran;
//	}

	public void setRollno(int num) {
		rollNo = num;
	}

	// Getters

	public String getName() {
		return stName;
	}
	public String getBranch() {
		return Branch;
	}
	public int getRollno() {
		return rollNo;
	}
	
	
	public void displayData() {
		System.out.println("Student Name : "+stName);
		System.out.println("Student Branch : "+Branch);
		System.out.println("Student RollNo : "+rollNo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
