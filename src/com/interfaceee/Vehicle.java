package com.interfaceee;

public interface Vehicle {
	
	public abstract void speed();
	public default void digitalScreen() {
		System.out.println("This is basic verstion....");
	}

}
