package com.Functional.Interfacee;

import java.util.function.Consumer;
import java.util.function.Predicate;

class Employeee{
	private String empName, empDesg;
	private double empSalary;
	public Employeee(String empName, String empDesg, double empSalary) {
		super();
		this.empName = empName;
		this.empDesg = empDesg;
		this.empSalary = empSalary;
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
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employeee [empName=" + empName + ", empDesg=" + empDesg + ", empSalary=" + empSalary + "]";
	}
	
	
}
public class Example4 {

	public static void main(String[] args) {
		Predicate<Employeee> check=new Predicate<Employeee>() {
			
			@Override
			public boolean test(Employeee emp) {
				
				return emp.getEmpSalary()> 10000;
			}
		};
		
		Consumer<Employeee> consumer=new Consumer<Employeee>() {
			@Override
			public void accept(Employeee employ) {
				employ.setEmpSalary(employ.getEmpSalary()+(employ.getEmpSalary()*0.10));
				System.out.println(employ.getEmpSalary());
			}
		};
		
		Employeee emp1=new Employeee("X", "Y", 20000.0);
		Employeee emp2=new Employeee("A", "B", 9000.0);
		Employeee emp3=new Employeee("C", "D", 50000.0);
		
		Employeee [] employs= {emp1,emp2,emp3};
		for(Employeee i:employs) {
			if(check.test(i)) {
				consumer.accept(i);
			}
		}
		

	}

}
