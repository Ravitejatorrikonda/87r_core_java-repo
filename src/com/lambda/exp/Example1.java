package com.lambda.exp;

//interface Animals {
//	void makingSound(int cost, String name);
//}

//class Dog implements Animals {
//	public void makingSound(int cost) {
//		System.out.println("Bow Bow"+cost);
//	}
//}

interface Parent {
	abstract boolean getData(int i);
}

public class Example1 {

	public static void main(String[] args) {
		Parent p = i -> i%2==0;
		System.out.println(p.getData(3));
		
		
		
		

//		Animals ani1 = new Dog();
//		ani1.makingSound(30000);
//
//		Animals ani2 = new Animals() {
//
//			@Override
//			public void makingSound(int cost) {
//				System.out.println("Bow Bow 2..."+cost);
//
//			}
//		};
//		ani2.makingSound(40000);

		// lambda expression

//		Animals ani3 =(int cost, String name)->System.out.println("Bow Bow 3..."+ cost+" "+name);
//        ani3.makingSound(50000,"chintu");

	}

}
