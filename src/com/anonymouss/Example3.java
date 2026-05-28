package com.anonymouss;

class Student{
	String stName;

	public Student(String stName) {
		super();
		this.stName = stName;
	}
	
}

@FunctionalInterface
interface St{
	String getstname();
	public default void getData() {
		
	}
}

public class Example3 {

	public static void main(String[] args) {
		Student s1=new Student("Suresh");
		System.out.println(s1.stName);
		
		St s2=new St() {
			public String getstname() {
				return "Saisudhesh";
			}
			
		};
		
	System.out.println(	s2.getstname());
		
		
	}

}
