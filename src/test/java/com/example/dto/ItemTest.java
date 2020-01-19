package com.example.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {
	@Test
	public void test_id() {
		Item item = new Item();
		item.setId(1);
		int actual = item.getId();
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void test_name() {
		Item item = new Item();
		item.setName("foo");
		String actual = item.getName();
		String expected = "foo";
		assertEquals(expected, actual);
	}

	@Test
	public void test_price() {
		Item item = new Item();
		item.setPrice(1000);
		int actual = item.getPrice();
		int expected = 10000;
		assertEquals(expected, actual);
	}

}
