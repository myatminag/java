package com.jdc.basic;

public class PrimeNumbers {

	public static boolean isPrimeNumber(int value) {
		if (value == 1) {
			return false;
		}
		
		for(var i = 2; i <= value / 2; i ++) {
			if (value % i == 0) {
				return false;
			}
		}
			
	
		return true;
	}
}
