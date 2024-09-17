package com.jdc.collection.demo;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentRepositoryWithSet implements StudentRepository {

	private Set<Student> set;
	private static int ID = 0;

	public StudentRepositoryWithSet() {
		set = new LinkedHashSet<>();
	}

	@Override
	public Collection<Student> getAll() {
		return Set.copyOf(set);
	}

	@Override
	public int add(Student student) {

		validate(student);

		set.add(student.withId(++ID));

		return ID;
	}

	@Override
	public Student findById(int id) {

		for (var student : set) {
			if (student.id() == id) {
				return student;
			}
		}

		return null;
	}

	@Override
	public boolean delete(int id) {

		var student = findById(id);

		if (student != null) {
			return set.remove(student);
		}

		return false;
	}

	@Override
	public boolean update(Student student) {

		validate(student);

		if (delete(student.id())) {
			return set.add(student);
		}

		return false;
	}

}
