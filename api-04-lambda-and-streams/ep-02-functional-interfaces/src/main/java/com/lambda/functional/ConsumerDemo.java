package com.lambda.functional;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		List<String> strList = List.of("Java Basic", "Spring", "Angular", "Docker");

		Consumer<String> printToUppercase = str -> System.out.println(str.toUpperCase());
		Consumer<String> printToLowercase = str -> System.out.println(str.toLowerCase());
		Consumer<String> printToUpperAndLowerCase = printToUppercase.andThen(printToLowercase);

		strList.forEach(printToUpperAndLowerCase);
	}
}
