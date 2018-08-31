package com.capgemini.collections.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.collections.Car;
import com.capgemini.collections.CellPhone;
import com.capgemini.collections.Laptop;
import com.capgemini.collections.School;
import com.capgemini.collections.Television;

class Question2Test {

	
		@Test
		void testLaptopDetails() {
			HashSet<Laptop> laptops=new HashSet<>();
		assertEquals(true,laptops.add(new Laptop("Dell","Inspiron15","Windows10","i3")));
		assertEquals(true,laptops.add(new Laptop("Samsung","Sam13","Windows8","i5")));	
		assertEquals(true,laptops.add(new Laptop("Lenovo","lenovo13","Windows10","i7")));
		assertEquals(false,laptops.add(new Laptop("Lenovo","lenovo13","Windows10","i7")));
		assertEquals(3,laptops.size());
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
			
		}
		}
	@Test
	void testCarDetails() {
		HashSet<Car> cars=new HashSet<>();
	assertEquals(true,cars.add(new Car("Honda","Jazz",2018,1500000)));
	assertEquals(true,cars.add(new Car("Nexa","Bolereo",2017,800000)));	
	assertEquals(true,cars.add(new Car("BMW","BMW12",2016,1700000)));
	assertEquals(false,cars.add(new Car("BMW","BMW12",2016,1700000)));
	assertEquals(3,cars.size());
	for (Car car : cars) {
		System.out.println(car);
		
		
	}
	}

	@Test
	void testTelevision() {
		HashSet<Television> television=new HashSet<>();
		assertEquals(true,television.add(new Television("LG","LED",true,15000)));
		assertEquals(true,television.add(new Television("Onida","LCD",true,80000)));	
		assertEquals(false,television.add(new Television("Onida","LCD",true,80000)));	
		assertEquals(true,television.add(new Television("samsung","LED",true,90000)));	
		
		assertEquals(3,television.size());
		for (Television television2 : television) {
			System.out.println(television2);
			
		}
	}
	@Test
	void testCellphone() {
		HashSet<CellPhone> cellphone=new HashSet<>();
		assertEquals(true,cellphone.add(new CellPhone("Moto","E","Good","Andriod",10000)));
		assertEquals(true,cellphone.add(new CellPhone("Oppo","F","Average","Andriod",80000)));	
		assertEquals(true,cellphone.add(new CellPhone("Iphone","X","Excellent","IOS",80000)));
		assertEquals(false,cellphone.add(new CellPhone("Iphone","X","Excellent","IOS",80000)));
		assertEquals(3,cellphone.size());
		for (CellPhone cellPhone2 : cellphone) {
			System.out.println(cellPhone2);
			
		}
	}
	@Test
	void testSchool() {
		HashSet<School> school=new HashSet<>();
		assertEquals(true,school.add(new School("EuroKids","HYD","HYD",1)));
		assertEquals(true,school.add(new School("Brilliant","Choutuppal","Nalgonda",2)));	
		assertEquals(true,school.add(new School("Queens","Airoli","Mumbai",3)));	
		assertEquals(false,school.add(new School("Brilliant","Choutuppal","Nalgonda",2)));	
		assertEquals(3,school.size());	
		for (School school2 : school) {
			System.out.println(school2);
	}
	}
}


