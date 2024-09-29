package com.lambda.functional;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Predicate<Integer> evenNum = a -> a % 2 == 0;
		Predicate<Integer> greaterThanFive = a -> a > 5;

		list.forEach(a -> {
			if (evenNum.and(greaterThanFive.negate()).test(a)) {
				System.out.println(a);
			}

		});
	}
}
