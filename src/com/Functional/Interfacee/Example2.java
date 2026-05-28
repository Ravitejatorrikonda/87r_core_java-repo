package com.Functional.Interfacee;

import java.util.function.Consumer;

class Employee{
	String empName;

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee Name : "+empName;
	}
	
	
}
public class Example2 {

	public static void main(String[] args) {
		Consumer<Employee> consumer=new Consumer<Employee>() {
			//    Employee emp=new Employee("Haradeep");
			public void accept(Employee emp) {
				System.out.println(emp.empName);
			}
		};
		consumer.accept(new Employee("Hardeep"));

	}

}
