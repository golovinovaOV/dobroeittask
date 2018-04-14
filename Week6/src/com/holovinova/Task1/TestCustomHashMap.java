package com.holovinova.Task1;

public class TestCustomHashMap {
	public static void main(String[] args) {
		CustomHashMap<Integer, User> map = new CustomHashMap<Integer, User>();
		System.out.println("Add user: " + map.put(8, new User("Tom", 23)));
		System.out.println("Add user: " + map.put(9, new User("Bobby", 15)));
		System.out.println("Add user: " + map.put(10, new User("Tomas", 10)));
		System.out.println("Add user: " + map.put(11, new User("Robin", 31)));
		System.out.println("Add user: " + map.put(null, new User("Din", 31)));
		map.display();
		System.out.println(map.get(8).toString());
		System.out.println(map.get(11).toString());		
		
	}	
}
