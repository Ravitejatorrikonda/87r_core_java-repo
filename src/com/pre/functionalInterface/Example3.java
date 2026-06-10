package com.pre.functionalInterface;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Employeee {
	String empName, empDesg;
	double salary;

	public Employeee(String empName, String empDesg, double salary) {
		super();
		this.empName = empName;
		this.empDesg = empDesg;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employeee [empName=" + empName + ", empDesg=" + empDesg + ", salary=" + salary + "]";
	}

}

public class Example3 {

	public static void main(String[] args) {
		Predicate<Employeee> check = new Predicate<Employeee>() {

			@Override
			public boolean test(Employeee emp) {

				return emp.getSalary() > 10000;
			}
		};

		Consumer<Employeee> c = new Consumer<Employeee>() {

			@Override
			public void accept(Employeee emp) {
				emp.setSalary(emp.getSalary() + (emp.getSalary() * 0.10));
				System.out.println(emp.getSalary());

			}
		};

		Employeee emp1 = new Employeee("Venkat", "SE", 50000.0);
		Employeee emp2 = new Employeee("Rahul", "SD", 9000.0);
		Employeee emp3 = new Employeee("Sandeep", "SE", 60000.0);

		Employeee[] employes = { emp1, emp2, emp3 };

		for (Employeee i : employes) {
			if (check.test(i)) {
				c.accept(i);
			}
		}

	}

}
