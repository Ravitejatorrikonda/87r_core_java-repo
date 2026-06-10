package com.pre.functionalInterface;

import java.util.function.Predicate;

class Child implements Predicate<Integer> {
	public boolean test(Integer i) {
		return i % 2 == 0;
	}
}

public class Example2 {

	public static void main(String[] args) {

		Predicate<Integer> p = new Child();
		System.out.println(p.test(34)?"Even":"Odd");
	}

}
