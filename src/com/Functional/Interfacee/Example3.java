package com.Functional.Interfacee;

import java.util.function.Predicate;

class St implements Predicate<Integer>{
	public boolean test(Integer i) {
		return i%2==0;
	}
}

public class Example3 {

	public static void main(String[] args) {
		Predicate<Integer> p=new St();
		System.out.println(p.test(34));

		
		Predicate<Integer> p2=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer i) {
				
				return i%2 !=0;
			}
		};
		System.out.println(p2.test(43));
	}

}
