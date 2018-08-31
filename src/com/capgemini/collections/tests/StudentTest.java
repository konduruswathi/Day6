package com.capgemini.collections.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.collections.Student;

class StudentTest {

	@Test
	void test() {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("swathi"));
		students.add(new Student("nikitha"));
		students.add(new Student("nandu"));
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
