package com.exception.test;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

class Parent {
	public void isEven(int num) throws Exception {
		if (num <= 0) {
			throw new RuntimeException("Invalid Number....");
		} else {
			System.out.println(num % 2 == 0 ? "Even" : "Odd");
		}
	}
}

public class Example5 {

	public static void main(String[] args) {
		try {
			new Parent().isEven(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" i am Exicuted...");
	}

}
