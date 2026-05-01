package com.thiskeyword;

public class Edxample2 {
	int a;//30
//                         20
	public void getdata(int a) {
		System.out.println(a);//20
		System.out.println(this.a);//10
		this.a=30;
	}

	public static void main(String[] args) {
		Edxample2 obj = new Edxample2();
		obj.a=10;
		
		obj.getdata(20);
		System.out.println(obj.a);//30
		
	}

}
