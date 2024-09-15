package com.jdc.demo.reflection;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.jdc.demo.usage.domain.Student;
import com.jdc.demo.usage.processor.FieldsValidationException;
import com.jdc.demo.usage.processor.FieldsValidator;

public class FieldsValidatorTest {

	@Test
	void test_no_error() {

		// prepare input
		var student = new Student();
		student.setName("Aung Aung");
		student.setPhone("09987654321");
		student.setDob(LocalDate.of(2000, 1, 1));

		// execute target method
		assertDoesNotThrow(() -> FieldsValidator.validate(student));
	}

	@Test
	void test_all_error() { 

		var student = new Student();

		var exception = assertThrows(FieldsValidationException.class, () -> FieldsValidator.validate(student));

		assertEquals(1, exception.getMessages().size());

	}

}
