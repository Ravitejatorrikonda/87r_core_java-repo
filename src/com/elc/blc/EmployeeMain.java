package com.elc.blc;

public class EmployeeMain {

	

	public static void main(String[] args) {
	        
			     Employee emp1=Employee.displayDetails();
			     
			     emp1.setEmpname("Chandu");
			     emp1.setEmpDesg("SD");
			     emp1.setEmpSalary(40000);
			     
			     System.out.println(emp1.getEmpDesg());
			
//			System.out.println(Employee.displayDetails());
			
			

	}

}
