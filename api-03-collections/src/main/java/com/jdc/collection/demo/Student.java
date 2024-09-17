package com.jdc.collection.demo;

import java.time.LocalDate;

public record Student(int id, String name, LocalDate dob, Gender gender, String phone, String email) {

	public enum Gender {
		Male, Female
	}
	
	public Student withId(int id) {
		return new Student(id, name, dob, gender, phone, email);
	}
}
