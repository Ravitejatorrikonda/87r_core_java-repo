package com.interfacee.Tv;

public class TvMain {

	public static void main(String[] args) {
		Telivision t;
		t=new DishTv();
		
		t.changechannel(20);
		t.volumeIncrese(30);
		t.volumeDecrease(10);
		System.out.println("==================");
		
		t=new LedTv();
		t.changechannel(120);
		t.volumeDecrease(40);
        t.volumeIncrese(10);
	}

}
