package com.java.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class FilteringStream {

	@Test
	void test_int_stream() {
		var stream = IntStream.iterate(1, a -> a + 1).limit(30);
		
		stream.filter(a -> a % 3 == 0).forEach(a -> System.out.println(a));
	}
	
	@Test
	void test_generic_stream() {
		var stream = Stream.of("Java", "Spring", "JBA", "Spring MVC", "Spring JDBC");
		
		stream.filter(a -> a.toLowerCase().contains("spring")).forEach(System.out::println);
	}
}
