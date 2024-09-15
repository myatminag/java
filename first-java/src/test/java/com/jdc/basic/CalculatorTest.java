package com.jdc.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	void beforeEach() {
		calc = new Calculator();
	}
	
	@ParameterizedTest
	@CsvSource(value = {
		"1, 5, 6",
		"10, 3, 13",
		"-1, 10, 9"
	})
	void test_add(int digitOne, int digitTwo, int expected) {
		var result = calc.add(digitOne, digitTwo);
		
		assertEquals(expected, result);
	}
}
