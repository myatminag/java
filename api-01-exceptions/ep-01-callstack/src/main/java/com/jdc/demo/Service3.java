package com.jdc.demo;

public class Service3 {

	public void execute(int a, int b) {
		try {
			System.out.println("Execute Service 3");

			var result = a / b;
			System.out.printf("A = $d, B = %d, A / B = %d%n", a, b, result);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Handle NumberFormatException");
		} finally {
			
		}
	}

}
