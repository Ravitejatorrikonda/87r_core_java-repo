package com.anonymouss;

class Parent{
	public void getJob() {
		System.out.println("Job");
	}
}
//class Child extends Parent{
//	
//	public void getJob() {
//		System.out.println("Sf Job...");
//	}
//}

public class Main {

	public static void main(String[] args) {
	
		// anonymous extends Parrent
		//Parent p=new Anonymous();
		Parent p=new Parent() {
			@Override
			public void getJob() {
				System.out.println("Sf Job....");
			}
		};
		p.getJob();
		

	}

}
