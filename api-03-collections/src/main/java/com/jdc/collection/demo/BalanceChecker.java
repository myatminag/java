package com.jdc.collection.demo;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class BalanceChecker {

	private Queue<Character> stack;

	public boolean isBalance(String value) {

		stack = Collections.asLifoQueue(new ArrayDeque<>());

		var chars = value.toCharArray();

		if (chars.length == 0) {
			return false;
		}

		for (var c : chars) {
			switch (c) {
			case '(', '[', '{' -> stack.offer(c);
			case ')', ']', '}' -> {
				var last = stack.poll();
				
				if (last == null) {
					return false;
				}
				
				if (!isMatch(last, c)) {
					return false;
				};
			}
			default -> throw new IllegalArgumentException();
			}
		}

		return stack.isEmpty();
	}

	private boolean isMatch(Character last, char current) {
		return (last == '(' && current == ')') || (last == '[' && current == ']') || (last == '{' && current == '}');
	}
}
