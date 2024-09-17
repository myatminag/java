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
			if (isOpen(c)) {
				stack.offer(c);
			} else {
				
			}
		}
		
		return false;
	}

	private boolean isOpen(char c) {
		return c == '(' || c == '[' || c == '{';
	}

}
