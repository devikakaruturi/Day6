package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.CollectionCar;
import com.capgemini.day6.domain.CollectionCellphone;
import com.capgemini.day6.domain.CollectionSchool;
import com.capgemini.day6.domain.CollectionTelevision;
import com.capgemini.day6.domain.SetCar;
import com.capgemini.day6.domain.SetSchool;
import com.capgemini.day6.domain.SetTelevision;
import com.capgemini.day6.domain.Setphone;

class SetcellphoneTest {
	@Test
	void testSetCar() {
		HashSet<SetCar> car=new HashSet<SetCar>();
		assertEquals(true,car.add(new SetCar("tata","nano",2005,200000)));
		car.add(new SetCar("benz","A",2006,200000));
		car.add(new SetCar("tata","B",2007,200000));
		assertEquals(3, car.size());
		for(SetCar c : car)
		{
			System.out.println(c);
		}
	}
	@Test
	void testSetphone() {
		HashSet<Setphone> phone=new HashSet<Setphone>();
		assertEquals(true,phone.add(new Setphone("gionee","A1","good featured","naught", 20000)));
		phone.add(new Setphone("oppo","A1","good featured","naught", 20000));
		phone.add(new Setphone("vivo","A1","good featured","naught", 10000));
		assertEquals(3, phone.size());
		for(Setphone p : phone)
		{
			System.out.println(p);
		}
	}
	@Test
	void testSetSchool() {
		HashSet<SetSchool> sch=new HashSet<SetSchool>();
		assertEquals(true,sch.add(new SetSchool("abc","vjy","A","B","C")));
		sch.add(new SetSchool("xyz","vjy","A","B","C"));
		sch.add(new SetSchool("hpt","vlv","X","Y","Z"));
		assertEquals(3, sch.size());
		for(SetSchool s : sch)
		{
			System.out.println(s);
		}
	}
	@Test
	void testSetTelevision() {
		HashSet<SetTelevision> tv=new HashSet<SetTelevision>();
		assertEquals(true,tv.add(new SetTelevision("samsung","A","enabled",15000)));
		tv.add(new SetTelevision("sony","B","enabled",3000));
		tv.add(new SetTelevision("lg","C","enabled",2500));
		assertEquals(3, tv.size());
		for(SetTelevision t : tv)
		{
			System.out.println(t);
		}
	}

}
