package com.interfacee.Tv;

public interface Telivision {
	
	public static final int volume=100;
	
	public abstract void changechannel(int channel);
	public abstract void volumeIncrese(int vol);
	abstract void volumeDecrease(int vol);

}
