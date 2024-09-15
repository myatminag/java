package com.jdc.basic.oop;

public class Car extends Vehicle {

	protected double power;

	public Car(double power) {
		super();
		this.power = power;
		System.out.println("Car Constructor.");
	}

	public void park() {
		System.out.println("Car is parking.");
	}

	public void drive() {
		System.out.println("Car is driving.");
	}
}
