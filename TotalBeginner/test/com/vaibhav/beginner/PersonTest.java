package com.vaibhav.beginner;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaximumBooks());
	}

	@Test
	public void testSetName() {
		Person p2 = new Person();
		p2.setName("Vaibhav");
		assertEquals("Vaibhav", p2.getName());
	}

	@Test
	public void testSetMaximumBooks() {
		Person p3 = new Person();
		p3.setMaximumBooks(10);
		assertEquals(10, p3.getMaximumBooks());
	}

}
