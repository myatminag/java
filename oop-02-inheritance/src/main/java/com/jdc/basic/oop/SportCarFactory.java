package com.jdc.basic.oop;

public class SportCarFactory extends CarFactory {

	@Override
	public SportCar create() {
		return new SportCar();
	}
}
