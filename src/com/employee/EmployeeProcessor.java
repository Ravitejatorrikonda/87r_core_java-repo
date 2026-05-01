package com.employee;
import com.employee.Employee;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee emp1=new Employee(100, "Rahul", "SD", 50000, 5);
	      
		System.out.println("EMployee Id : "+emp1.getEmpId());
		System.out.println("EMployee Name : "+emp1.getEmpName());
		System.out.println("EMployee Desg : "+emp1.getEmpDesg());
		System.out.println("EMployee Salary : "+emp1.getEmpSalary());
		System.out.println("EMployee performanceRating : "+emp1.getPerformanceRating());
System.out.println("===============================");
		
		emp1.promoteEmployee("SE");
		
		System.out.println(emp1.getEmpDesg());
		System.out.println(emp1.getEmpSalary());
		
	}

}
