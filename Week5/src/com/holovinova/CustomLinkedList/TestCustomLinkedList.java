package com.holovinova.CustomLinkedList;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for CustomLinkedList
 * @author Golovinova Oksana
 *
 */
public class TestCustomLinkedList {

	/**
	 * Test size method 
	 */
	@Test
	public void testSize() {
		CustomLinkedList<User> userLinkedList = new CustomLinkedList<User>();
		Assert.assertEquals(0, userLinkedList.size());
		userLinkedList.add(new User("Tom", 20));
		userLinkedList.add(new User("Nik", 30));
		userLinkedList.add(new User("Robin", 42));
		Assert.assertEquals(3, userLinkedList.size());
		Assert.assertTrue(userLinkedList.size() != 2);		
	}
	
	/**
	 * Test isEmpty method 
	 */
	@Test
	public void testIsEmpty() {
		CustomLinkedList<User> userLinkedList = new CustomLinkedList<User>();
		Assert.assertTrue(userLinkedList.isEmpty());
		userLinkedList.add(new User("Robin", 15));
		Assert.assertFalse(userLinkedList.isEmpty());
	}
	
	/**
	 * Test contains method 
	 */
	@Test
	public void testContains() {
		CustomLinkedList<User> userLinkedList = new CustomLinkedList<User>();
		userLinkedList.add(new User("Tom", 15));
		userLinkedList.add(new User("Nik", 25));
		userLinkedList.add(new User("Robin", 35));
		Assert.assertTrue(userLinkedList.contains(new User("Robin", 35)));
		Assert.assertFalse(userLinkedList.contains(new User("Tomas", 15)));
	}
	
	/**
	 * Test add method 
	 */
	@Test
	public void testAdd() {
		CustomLinkedList<User> userLinkedList = new CustomLinkedList<User>();
		userLinkedList.add(new User("Tom", 15));
		Assert.assertTrue(userLinkedList.contains(new User("Tom", 15)));
		Assert.assertEquals(1, userLinkedList.size());
		userLinkedList.add(new User("Robin", 20));
		Assert.assertTrue(userLinkedList.contains(new User("Robin", 20)));
		Assert.assertEquals(2, userLinkedList.size());
	}
	
	/**
	 * Test remove method 
	 */
	@Test
	public void testRemove() {
		CustomLinkedList<User> userLinkedList = new CustomLinkedList<User>();
		userLinkedList.add(new User("Tom", 20));
		userLinkedList.add(new User("Nik", 10));
		userLinkedList.add(new User("Robin", 32));
		Assert.assertTrue(userLinkedList.contains(new User("Tom", 20)));
		Assert.assertTrue(userLinkedList.remove(new User("Tom", 20)));
		Assert.assertFalse(userLinkedList.contains(new User("Tom", 20)));
		
		
	}
	
	
	
	
	

}
