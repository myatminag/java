package com.jdc.basic.oop;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class InheritanceTest {

	@Test
	@Disabled
	void test_one() {
		var sportCar = new SportCar();
		sportCar.power = 10;
		
		sportCar.drive();
		sportCar.park();
	}
	
	@Test
	void test_two() {
		Car car = new SportCar(10);
		car.drive();
		
		SportCar sportCar = (SportCar) car;
		sportCar.turboOn();
	}
}
