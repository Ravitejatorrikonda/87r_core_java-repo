package com.interfacee.Tv;

public class DishTv  implements Telivision{

	@Override
	public void changechannel(int channel) {
		System.out.println("changing tv channel into  : "+channel);
		
	}

	@Override
	public void volumeIncrese(int vol) {
		System.out.println("volume increase : "+ (Telivision.volume+vol));
		
	}

	@Override
	public void volumeDecrease(int vol) {
		System.out.println("decreasing volume : "+(Telivision.volume-vol));
		
	}

}
