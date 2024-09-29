package com.lambda.functional;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		var result = findCharCount("Hello Java and Spring", 'a');
		System.out.println(result);
	}

	static int findCharCount(String str, char c) {

		Function<String, char[]> strToCharArray = a -> a.toCharArray();
		Function<char[], Integer> countingChar = arr -> {
			int count = 0;

			for (var i : arr) {
				if (i == c) {
					count++;
				}
			}

			return count;
		};

		return strToCharArray.andThen(countingChar).apply(str);
	}
}
