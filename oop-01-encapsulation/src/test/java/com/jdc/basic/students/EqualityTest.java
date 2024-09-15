package com.jdc.basic.students;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EqualityTest {

	@Test
	void test_equal() {
		var studentOne = new Student(1, "Aung Aung", "09987654321", "aungaung@gmail.com");
		var studentTwo = new Student(1, "Aung Aung", "09987654321", "aungaung@gmail.com");
		
		System.out.println(studentOne);
		System.out.println(studentTwo);
		
		assertTrue(studentOne.equals(studentTwo));
	}
}
