package com.java.stream.map;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class SortedTest {

	@Test
	void test_sorted_with_comparator() {
		var productDir = Path.of("data", "product");

		try (var stream1 = Files.lines(productDir.resolve("product1.txt"))) {
			var stream2 = Files.lines(productDir.resolve("product2.txt"));

			Stream<Stream<String>> streams = Stream.of(stream1, stream2);

			streams.flatMap(stream -> stream)
					.map(line -> line.split("\t"))
					.filter(arr -> arr.length == 3)
					.map(arr -> new Product(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2])))
					.sorted((a, b) -> b.price() - a.price())
					.forEach(product -> System.out.println(product));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
