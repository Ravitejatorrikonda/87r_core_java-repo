package com.exception.test;

class Demo{
	public void isEven(int num) {
		if(num <=0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Something even");
		}
	}
}

public class Example6 {

	public static void main(String[] args) {
		new Demo().isEven(0);
		System.out.println(" i am Exicuted hello...");
	}

}
