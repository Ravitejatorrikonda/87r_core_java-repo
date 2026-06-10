package com.pre.functionalInterface;
import java.util.function.Consumer;

//class Student implements Consumer<String>{
//	@Override
//	public void accept(String str) {
//		System.out.println(str);
//	}
//}

class Employee{
	String empName;

	public Employee(String empName) {
		
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee : "+empName;
	}
	
	
	
	
}

public class Example1 {

	public static void main(String[] args) {
		
		Consumer<Employee> c=new Consumer<Employee>() {
			
			@Override     //    Employee emp=new Employeee("Suresh")
			public void accept(Employee emp) {
				System.out.println(emp);
				
			}
		};
		
		c.accept(new Employee("Suresh"));
		
		
		
		
		
//		Consumer<String> consumer=new Student();
//		consumer.accept("Java is Awesome..");
		
//		Consumer<String> c=new Consumer<String>() {
//			
//			@Override
//			public void accept(String str) {
//				System.out.println(str);
//				
//			}
//		};
//		c.accept("Javascript is awesome..");
//		
//		Consumer<Integer> c2=new Consumer<Integer>() {
//			
//			public void accept(Integer i) {
//				System.out.println("Integer value : "+ i);
//			}
//		};
//		c2.accept(34);

	}

}
