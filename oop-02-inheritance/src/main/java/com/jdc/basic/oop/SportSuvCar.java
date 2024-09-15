package com.jdc.basic.oop;

public class SportSuvCar extends SportCar {
	
	public SportSuvCar() {
		System.out.println("Sport Suv Car Constructor.");
	}

	public void startFourWheel() {
		System.out.println("Driving with four wheels.");
	}
	
	@Override
	public void drive() {
		System.out.println("Driving and drifting rough on road.");
	}
}
