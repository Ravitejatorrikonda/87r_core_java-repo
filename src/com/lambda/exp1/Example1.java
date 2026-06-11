package com.lambda.exp1;

interface Parent {
	public abstract boolean getData(int a);
}

public class Example1 {

	public static void main(String[] args) {

		// Lambda Expressions
		
		Parent p=(int a)-> a%2==0;
			
		
		System.out.println(p.getData(2));
		
	}

}
