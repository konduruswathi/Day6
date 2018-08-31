package com.capgemini.collections.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.collections.Student1;

class Student1Test {
@Test
	void test() {
		TreeSet<Student1> students = new TreeSet<>();
		assertEquals(true,students.add(new Student1(1,"swathi","cse")));
		assertEquals(true,students.add(new Student1(21,"bindu","cse")));
		assertEquals(true,students.add(new Student1(10,"nikitha","cse")));
		
		
		for (Student1 student1 : students) {
			System.out.println(student1);
		}
	}

}
