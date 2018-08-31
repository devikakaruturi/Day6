package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Studentnatural;

class StudentNaturalTest {

	@Test
	void teststudent() {
		TreeSet<Studentnatural> ts= new TreeSet<>();
		assertEquals(true, ts.add(new Studentnatural("devi",1)));
		assertEquals(true, ts.add(new Studentnatural("devika",2)));
		assertEquals(true, ts.add(new Studentnatural("d",3)));
		assertEquals(true, ts.add(new Studentnatural("dv",4)));
		
		for(Studentnatural sn: ts)
		{
			System.out.println(sn);
		}
	}

}
