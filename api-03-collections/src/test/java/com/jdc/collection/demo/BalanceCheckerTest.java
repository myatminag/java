package com.jdc.collection.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BalanceCheckerTest {

	private BalanceChecker checker = new BalanceChecker();
	
	@ParameterizedTest
	@ValueSource(strings = {
		"[]",
		"()",
		"{}",
		"[](){}",
		"[()]{([])}"
	})
	void test_true(String value) {
		assertTrue(checker.isBalance(value));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {
		"[",
		"()[",
		"",
		"[]((){}",
		"([[[}}}",
		"[()]){([])}"
	})
	void test_false(String value) {
		assertFalse(checker.isBalance(value));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {
		"[ ",
		"() ",
		"abcd"
	})
	void test_exception(String value) {
		assertThrows(IllegalArgumentException.class, () -> checker.isBalance(value));
	}
}
