package com.holovinova.CustomLinkedList;

/**
 * Custom realization of doubly linked list
 * @author Golovinova Oksana
 *
 * @param <T>
 */
public class CustomLinkedList<T> {
	/**
	 * Link to the head of list
	 * */
	private Node head = null;
	/**
	 * Size of list
	 */
	private int size = 0;

	/**
	 * Node that will be store in a list
	 * @author Golovinova Oksana
	 *
	 */
	class Node {
		/**
		 * Data to store
		 */
		T data;
		
		/**
		 * Link to the next element
		 */
		Node next;
		/**
		 * Link to the previous element
		 */
		Node prev;
		
		/**
		 * Constructor for Node
		 * @param data
		 */
		Node(T data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}

	/**
	 * Method for adding new element to list
	 * @param element
	 * @return
	 */
	public boolean add(T element) {
		// get copy of a link to head of list
		Node newNode = new Node(element);
		// create link to last element of list
		Node last = head;
		// set next link to null
		newNode.next = null;
		// if there is no elements in list
		if (head == null) {
			// set link to previous element to null
			newNode.prev = null;
			// link head to new element because it's first one
			head = newNode;
			// increment size
			size++;
			return true;
		}
		// find last element 
		while (last.next != null) {
			// get link to last element
			last = last.next;
		}
		// add new element to the end of list
		
		// link next link of last element to new element
		last.next = newNode;
		// link previous link of new element to last element
		newNode.prev = last;
		// increment size
		size++;
		return true;
	}

	/**
	 * Method that returns size of list
	 * @return
	 */
	public int size() {
		return this.size;
	}
	
	/**
	 * Method that checks if list if empty
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	
	/**
	 * Method that checks if list contains element
	 * @param element
	 * @return
	 */
	public boolean contains(T element) {
		Node tempNode = head;
		// go through all elements
		while (tempNode != null) {
			// in this case element exist
			if (tempNode.data.equals(element)) {
				return true;
			}
			tempNode = tempNode.next;
		}
		return false;
	}

	/**
	 * Method that removes element from list
	 * @param element
	 * @return
	 */
	public boolean remove(T element) {
		Node tempNode = head;
		// go through all elements 
		while (tempNode != null) {
			// if current element equals to element 
			if (tempNode.data.equals(element)) {
				// in case if it's head of a list
				if(head == tempNode) {
					head = tempNode.next;
				}
				// in case if it's last element
				if (tempNode.next != null) {
					tempNode.next.prev = tempNode.prev;

				}
				// in case if it's first element
				if (tempNode.prev != null) {
					tempNode.prev.next = tempNode.next;
				}
				// decrement size because element had been successfully removed
				size--;
				return true;
			}			
		}
		// this element doesn't exist in list 
		return false;
	}

	/**
	 * Method that shows all elements of list
	 */
	public void print() {
		Node tempNode = head;
		// go from first element to last one and print it
		while (tempNode != null) {
			System.out.println(tempNode.data.toString());
			tempNode = tempNode.next;
		}
	}

}