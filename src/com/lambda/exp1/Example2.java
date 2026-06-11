package com.lambda.exp1;

import java.util.function.Consumer;

public class Example2 {

	public static void main(String[] args) {
		Consumer<Integer> consumer = i -> System.out.println(i + 20);

		consumer.accept(20);
	}

}
