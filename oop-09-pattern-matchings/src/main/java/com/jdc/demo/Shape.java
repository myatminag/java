package com.jdc.demo;

public sealed interface Shape permits Square, Rectangle {

	int getArea();
}
