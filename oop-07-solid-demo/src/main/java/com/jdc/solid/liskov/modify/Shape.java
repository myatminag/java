package com.jdc.solid.liskov.modify;

public abstract class Shape {

	private int base;

	public abstract int getArea();

	public void setBase(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}
}
