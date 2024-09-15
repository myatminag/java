package com.jdc.demo;

import org.junit.jupiter.api.Test;

public class TypeCastingProblem {

	@Test
	void test() {
		Rectangle rectangle = new Rectangle(10, 5);
		Square square = new Square(10);

		Shape s1 = rectangle;
		Shape s2 = square;

		// ** Type Pattern
		if (s2 instanceof Rectangle r1) {
//			Rectangle r1 = (Rectangle) s2;
			System.out.printf("Base :  %d%n", r1.base());
			System.out.printf("Height :  %d%n", r1.height());
			System.out.printf("Area :  %d%n", r1.getArea());
		}

		// ** Record Pattern
		if (s2 instanceof Rectangle(var base, var height)) {
//			Rectangle r1 = (Rectangle) s2;
			System.out.printf("Base :  %d%n", base);
			System.out.printf("Height :  %d%n", height);
			System.out.printf("Area :  %d%n", base * height);
		}
	}
}
