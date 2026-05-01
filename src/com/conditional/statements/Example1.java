package com.conditional.statements;

/**
 * conditional statements:- ------------------------
 * 
 * conditional statements is used to control the block of code based on the
 * condition, Here condition is ntg but a TRUE or FALSE
 * 
 * ->simple if ->if else ->ladder if ->switch case ->nested if
 * 
 * sy:- if(condition){ //statements }
 * 
 * sy:-
 * 
 * if(condition){ //statements }else{ //statements }
 * 
 * write a java program to find the largest number based on variables
 * 
 * a->is big
 * b->is big
 * ->both are equal
 * a=30;
 * b=40;
 * 
 * 
 */

public class Example1 {
	
	public static void main(String[] args) {
		int a=30;
		int b=40;
		if(a>b) {
			System.out.println("A is BIG");
		}if(a<b) {
			System.out.println("B is Big");
		}else {
			System.out.println("Both are equal");
		}

	}

}
