package com.conditional.statements;

public class Example2 {
	/**
	 * 
	 * 
	 * it is a short hand of if else, and it is a sinle line statement
	 * sy:-
	 * 
	 * (condition)?"statements":"False(//statements)";
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int age =20;
		String result=(age> 18)?"eligible for voting":"Not eligible for voting";
		System.out.println(result);
		
		
		

	}

}
