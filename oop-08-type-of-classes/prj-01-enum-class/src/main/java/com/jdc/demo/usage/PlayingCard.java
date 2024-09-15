package com.jdc.demo.usage;

public enum PlayingCard implements Card {

	SpadeA, DiamondA;

	@Override
	public int value() {
		return ordinal() + 1;
	}
}
