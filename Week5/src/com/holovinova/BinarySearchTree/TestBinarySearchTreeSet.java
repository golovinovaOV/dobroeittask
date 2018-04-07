package com.holovinova.BinarySearchTree;

import com.holovinova.CustomLinkedList.User;

public class TestBinarySearchTreeSet {

	public static void main(String[] args) {
		BinarySearchTreeSet<User> bst = new BinarySearchTreeSet<User>();
		
		System.out.println("Is empty:" + bst.isEmpty());
		bst.add(new User("Tomas", 33));
		bst.add(new User("Tom", 10));		
		bst.add(new User("Tobi", 25));
		bst.add(new User("Tobi", 25));
		bst.add(new User("Tony", 55));
		bst.add(new User("Robin", 45));
		bst.add(new User("Tobi", 13));
		bst.add(new User("Tobi", 3));
		bst.add(new User("Tony", 65));
		bst.add(new User("Robin", 95));		
		bst.print();
		System.out.println();
		System.out.println("Is empty:" + bst.isEmpty());
		System.out.println();
		System.out.println("Size:" + bst.size());
		System.out.println();
		System.out.println("Min element: " + bst.minElement().toString());
		System.out.println("Max element: " + bst.maxElement().toString());
		System.out.println();
		System.out.println("Contain " + new User("Tobi", 25).toString()+  ": " + bst.contain(new User("Tobi", 25)));
		System.out.println("Contain " + new User("Tobi", 10).toString()+  ": " + bst.contain(new User("Tobi", 10)));
		System.out.println("Contain " + new User("Tomas", 33).toString()+  ": " + bst.contain(new User("Tomas", 33)));
		System.out.println("Contain " + new User("Robin", 45).toString()+  ": " + bst.contain(new User("Robin", 45)));
				
		bst.remove(new User("Tony", 55));
		
		System.out.println();
		System.out.println("Is empty:" + bst.isEmpty());
		System.out.println();
		System.out.println("Size:" + bst.size());
		System.out.println();	
		bst.print();
		/*		       	33
			        /    	  \
			       10   	   55
			      /  \   	  /  \
			    3    25 	 45  65 
			    	/  			   \
			       13  			   95
			       
		*/
	}
	

}
