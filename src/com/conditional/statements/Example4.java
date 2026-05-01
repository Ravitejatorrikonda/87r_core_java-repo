package com.conditional.statements;

public class Example4 {
	/**
	 * 
	 * Switch case :- ------------- switch case is used to compare the single
	 * values, it is a short rep;acement of ladder if
	 * 
	 * swicth only acceepetd belo types:- byte short int char switch case does not
	 * accept the float double long boolean
	 * 
	 * after java 1.5 switch is is allowed to use strings after java 1.7 switch is
	 * allowed to use Enum; ->(Symbol)
	 * 
	 * Sy:-
	 * 
	 * switch(expression/iden){ case value://statements;break;
	 * default://statements;break;
	 * 
	 * }
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int number = 101;

		switch (number) {
		
			
		case (100): {
			System.out.println("Police");
			break;

		}
		case (102): {
			System.out.println("Ambulance");
			break;
		}
		case (101): {
			System.out.println("Fire");
			break;
		}
		default:
			System.out.println("Not valid numbers");

		}

	}

}
