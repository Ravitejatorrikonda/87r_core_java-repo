package com.Functional.Interfacee;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example5 {

	public static void main(String[] args) {
		
		
		
		
		Function<String, String> f=new Function<String, String>() {
			public String apply(String i) {
				return i.toUpperCase();
			}
		};
	System.out.println(	f.apply("Java is Awesome"));
		
		
		
		
		
		
//		Supplier s=new Supplier<String>() {
//			public String get() {
//				return "Java is awesome";
//			}
//		};
//		System.out.println(s.get());

	}

}
