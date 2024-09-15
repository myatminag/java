package com.jdc.basic.oop;

public class SportCar extends Car {
	
	public SportCar() {
		super(8.0);
		System.out.println("Sport Car with Default Power.");
	}
	
	public SportCar(double power) {
		super(power);
		System.out.println("Sport Car with Custom Power.");
	}

	public void turboOn() {
		System.out.println("Turbo on.");
	}
	
	@Override
	public void drive() {
		System.out.println("Driving too fast.");
	}
}
