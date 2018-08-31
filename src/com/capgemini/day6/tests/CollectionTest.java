package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.CollectionCar;
import com.capgemini.day6.domain.CollectionCellphone;
import com.capgemini.day6.domain.CollectionLaptop;
import com.capgemini.day6.domain.CollectionSchool;
import com.capgemini.day6.domain.CollectionTelevision;

class CollectionTest {
	

	@Test
	void testCollectionLaptop() {
		ArrayList<CollectionLaptop> laptop=new ArrayList<CollectionLaptop>();
		assertEquals(true,laptop.add(new CollectionLaptop("lenovo","A","Windows","i3")));
		laptop.add(new CollectionLaptop("dell","B","Windows","i5"));
		laptop.add(new CollectionLaptop("hp","C","ios","i3"));
		assertEquals(3, laptop.size());
	}
	@Test
	void testCollectionCar() {
		ArrayList<CollectionCar> car=new ArrayList<CollectionCar>();
		assertEquals(true,car.add(new CollectionCar("tata","nano",2005,200000)));
		car.add(new CollectionCar("benz","A",2006,200000));
		car.add(new CollectionCar("tata","B",2007,200000));
		assertEquals(3, car.size());
	}
	@Test
	void testCollectionCellphone() {
		ArrayList<CollectionCellphone> phone=new ArrayList<CollectionCellphone>();
		assertEquals(true,phone.add(new CollectionCellphone("gionee","A1","good featured","naught", 20000)));
		phone.add(new CollectionCellphone("oppo","A1","good featured","naught", 20000));
		phone.add(new CollectionCellphone("vivo","A1","good featured","naught", 10000));
		assertEquals(3, phone.size());
	}
	@Test
	void testCollectionTelevision() {
		ArrayList<CollectionTelevision> tv=new ArrayList<CollectionTelevision>();
		assertEquals(true,tv.add(new CollectionTelevision("samsung","A","enabled",15000)));
		tv.add(new CollectionTelevision("sony","B","enabled",3000));
		tv.add(new CollectionTelevision("lg","C","enabled",2500));
		assertEquals(3, tv.size());
		
	}
	@Test
	void testCollectionSchool() {
		ArrayList<CollectionSchool> sch=new ArrayList<CollectionSchool>();
		assertEquals(true,sch.add(new CollectionSchool("abc","vjy","A","B","C")));
		sch.add(new CollectionSchool("xyz","vjy","A","B","C"));
		sch.add(new CollectionSchool("hpt","vlv","X","Y","Z"));
		assertEquals(3, sch.size());
	}
}
