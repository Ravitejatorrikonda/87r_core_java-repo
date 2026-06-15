package com.exception.test;


class Emp{
	public void isEven(int num)throws NullPointerException, ArithmeticException{
		if(num==0) {
			throw new NullPointerException("Zero Not Valid ...");
		}else if(num < 0) {
			throw new ArithmeticException("negative values not  valid..");
		}else {
			System.out.println("is Even");
		}
	}
}
public class Example7 {

	public static void main(String[] args) {
		try {
			new Emp().isEven(-1);
		} catch (NullPointerException | ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("i  am Exicuted...");

	}

}
