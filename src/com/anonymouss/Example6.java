package com.anonymouss;

import java.util.function.Consumer;


public class Example6 {

	public static void main(String[] args) {
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		};
		c.accept("java is awesome..");

	}

}
