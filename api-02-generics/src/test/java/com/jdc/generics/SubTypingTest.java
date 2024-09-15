package com.jdc.generics;

import org.junit.jupiter.api.Test;

public class SubTypingTest {

	@Test
	void test() {
		
		SuperType<Number> superType = new SubType<Number>();
	}
}
