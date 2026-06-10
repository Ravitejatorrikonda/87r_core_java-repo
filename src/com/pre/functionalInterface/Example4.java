package com.pre.functionalInterface;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example4 {

	public static void main(String[] args) {
//		Supplier<String> s=new Supplier<String>() {
//			
//			@Override
//			public String get() {
//				
//				return "Hello There";
//			}
//		};
//	   System.out.println(s.get());

		
		
		Function<Integer, String> f=new Function<Integer, String>() {
			
			@Override
			public String apply(Integer i) {
				return "Integer value : "+i;
			}
		};
		System.out.println(f.apply(34));
	}

}
