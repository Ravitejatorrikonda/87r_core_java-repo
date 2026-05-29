package com.lambda.exp;

import java.util.function.Predicate;

interface NumberCh {
	boolean checkNumber(int num);
}

interface ChracterCh {
	void checkChar(char ch);
}

public class Example2 {
	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		NumberCh n =num ->isPrime(num);
		System.out.println(n.checkNumber(3)?"Prime":"! Prime ");
		
		
		Predicate<Integer> p= i->isPrime(i);
		System.out.println(p.test(4)?"Prime":"! Prime");
		
		
		
		ChracterCh c=ch ->System.out.println(isPrime(ch)?"Prime":"! Prime");
		c.checkChar('A');
		
		
	}

}
