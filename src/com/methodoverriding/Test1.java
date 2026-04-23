package com.methodoverriding;



class Parent{
	public void eating(String str) {
		System.out.println("Parent eating idly....");
	}
	public void sleep(String str) {
		System.out.println("parent sleep at 9 pm");
	}
	
	
}
class Child extends Parent{
	public void eating(String str) {
		System.out.println("child eats fastFoods..........");
	}
	public void sleep(String str) {
		System.out.println("child sleep at 1 am");
	}
	
//	public void playOnlineGames() {
//		System.out.println("palying games");
//	}
}

public class Test1 {

	public static void main(String[] args) {
		Parent parent=new Parent();
		Child child=new Child();
		
		Parent parent1=new Child();
		
		parent1.eating("hi");
		parent1.sleep("hello");
//		parent1.playOnlineGames();
		System.out.println("===============");
		
		
		/**
		 * at time of compilation
		 * 
		 * first compiler will check the method is present in parent or not
		 * 
		 * ->if method is not present in parent it will through a compile time error
		 * ->if method is present in parent class, compiler will give the
		 *  responsibulitys of method is interpreter
		 *  
		 *  interpreter checks the which object you are going to create,those methods are invoking.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		parent.sleep("hello");
		parent.eating("there");
		System.out.println("----------------");
		
		child.eating("hello");
		child.sleep("there");

	}

}
