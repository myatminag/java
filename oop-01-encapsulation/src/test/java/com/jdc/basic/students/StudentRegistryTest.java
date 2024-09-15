package com.jdc.basic.students;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StudentRegistryTest {

	private StudentRegistry registry;

	@BeforeEach
	void beforeEach() {
		registry = new StudentRegistry();
	}

	@ParameterizedTest
	@CsvSource(value = { "Aung Aung, 09987654321, aungaung@gmail.com, 1", "Maung Maung, , , 1" })
	void test_add(String name, String phone, String email, int expectedId) {

		var input = new Student(name, phone, email);

		var result = registry.add(input);

		// Check result
		assertEquals(expectedId, result.id());
		assertEquals(name, result.name());
		assertEquals(phone, result.phone());
		assertEquals(email, result.email());
	}

	@Test
	void test_getAll() {

		registry.add(new Student("Thida", null, null));
		registry.add(new Student("Aung Aung", null, null));
		registry.add(new Student("Maung Maung", null, null));

		var students = registry.getAll();

		assertEquals(1, students[0].id());
		assertEquals("Thida", students[0].name());

		assertEquals(3, students[students.length - 1].id());
		assertEquals("Maung Maung", students[students.length - 1].name());
	}
}
