package com.instancee.object;

public class Example2 {
	
	public String empName;
	public int id;
	public double salary;
	//non static/instance method
	public void display() {
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee  id: "+id);
		System.out.println("Employee salary : "+salary);
	}

	public static void main(String[] args) {
		Example2 obj1=new Example2();
		Example2 obj2=new Example2();
		System.out.println("----------Object 1------------");
		obj1.empName="Venkatesh";
		obj1.id=40;
		obj1.salary=200000.0;
		obj1.display();
		System.out.println("-----------Object 2-----------");
		obj2.empName="chandu";
		obj2.id=60;
		obj2.salary=6000000.0;
		obj2.display();

	}

}
