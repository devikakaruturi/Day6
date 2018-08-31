package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Student;

class StudentTest {

	@Test
	void testStudent() {
		Student s1 = new Student("ABC");
		Student s2 = new Student("XYZ");
		Student s3 = new Student("yyy");
		ArrayList<Student> student = new ArrayList<>();
		assertEquals(true,student.add(s1));
		assertEquals(true,student.add(s2));
		assertEquals(true,student.add(s3));
		assertEquals(3, student.size());
		assertEquals(s1, student.get(0));
		assertEquals(s2, student.get(1));
		assertEquals(s3, student.get(2));
		for(Student st : student)
		{
			System.out.println(st);
		}
	}

	
}
