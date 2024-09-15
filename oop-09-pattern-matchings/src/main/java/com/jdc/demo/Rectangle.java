package com.jdc.demo;

public record Rectangle(int base, int height) implements Shape {

	@Override
	public int getArea() {
		return base * height;
	}

}
