package com.jdc.demo;

public record StudentData(String code, String name, String phone, String email) {

	public StudentData(String code, String name) {
		this(code, name, null, null);
	}
}
