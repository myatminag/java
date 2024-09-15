package com.jdc.basic.oop;

public class CarFactory {

	protected Car create() {
		return new Car(3.0);
	}
}
