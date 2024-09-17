package com.jdc.collection.demo;

import java.util.Collection;

public interface StudentRepository {

	Collection<Student> getAll();
	
	int add(Student studnet);	
	
	Student findById(int id);
	
	boolean delete(int id);
	
	boolean update(Student student);
}
