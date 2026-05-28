package com.Functional.Interfacee;

import java.util.function.Consumer;

class Demo implements Consumer<String>{
	@Override
	public void accept(String str) {
		System.out.println(str);
	}
	
}


public class Example1 {

	public static void main(String[] args) {
		Consumer<String> consumer=new Demo();
		
		consumer.accept("java is Awesome");
		
		Consumer<String> consumer2=new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		};
		
		consumer2.accept("javascript is awesome");
		
		Consumer<Integer> consumer3=new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		consumer3.accept(34);

	}

}
