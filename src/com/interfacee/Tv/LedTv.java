package com.interfacee.Tv;

public class LedTv implements Telivision{

	@Override
	public void changechannel(int channel) {
		System.out.println("changing LEDtv channel into  : "+channel);
		
	}

	@Override
	public void volumeIncrese(int vol) {
		System.out.println("LED Tv volume increase : "+ (Telivision.volume+vol));
		
	}

	@Override
	public void volumeDecrease(int vol) {
		System.out.println("LED Tv decreasing volume : "+(Telivision.volume-vol));
		
	}

	

}
