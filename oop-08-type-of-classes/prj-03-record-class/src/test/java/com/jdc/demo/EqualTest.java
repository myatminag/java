package com.jdc.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EqualTest {

	@ParameterizedTest
	@CsvSource({ "A-001, Aung Aung, 09987654321, aungaung@gmail.com" })
	void test(String code, String name, String phone, String email) {
		var s1 = new StudentDTO(code, name, phone, email);
		var s2 = new StudentDTO(code, name, phone, email);

		assertEquals(s1, s2);
	}

	@ParameterizedTest
	@CsvSource({ "A-001, Aung Aung, 09987654321, aungaung@gmail.com" })
	void test_record(String code, String name, String phone, String email) {
		var s1 = new StudentData(code, name, phone, email);
		var s2 = new StudentData(code, name, phone, email);

		System.out.println(s1);
		System.out.println(s2);

		assertEquals(s1, s2);
		assertEquals(name, s1.name());
	}
}
