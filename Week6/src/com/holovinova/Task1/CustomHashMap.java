package com.holovinova.Task1;

public class CustomHashMap<K, V> {

	private Node<K, V>[] table;
	private static final int CAPACITY = 4;

	static class Node<K, V> {
		K key;
		V value;
		Node<K, V> next;

		public Node(K key, V value, Node<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public CustomHashMap() {
		table = new Node[CAPACITY];
	}

	private int hash(K key) {
		return Math.abs(key.hashCode()) % CAPACITY;
	}

	/**
	 * Method adds new element to map
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean put(K key, V value) {
		// can't add null key
		if (key == null) {
			return false;
		}
		// get hash for key
		int hash = hash(key);
		// create new node
		Node<K, V> newNode = new Node<K, V>(key, value, null);
		// if no element with "hash" index in table
		// just add element
		if (table[hash] == null) {
			table[hash] = newNode;
			return true;
		} else {
			// now we need to find place (in linked list) for element
			Node<K, V> previous = null;
			Node<K, V> current = table[hash];
			// go through element in list
			while (current != null) {
				// in case element with same key has been found
				if (current.key.equals(key)) {
					// put element on first position
					if (previous == null) {
						newNode.next = current.next;
						table[hash] = newNode;
						return true;
					} else {
						// put element before element with same key
						newNode.next = current.next;
						previous.next = newNode;
						return true;
					}
				}
				// in case hadn't been found yet
				// set new previous and current elements
				previous = current;
				current = current.next;
			}
			// if there is no element with such key in list just add it after existing
			// element
			previous.next = newNode;
		}
		return false;
	}

	/**
	 * Method returns element by key (if element is present)
	 * 
	 * @param key
	 * @return
	 */
	public V get(K key) {
		// get hash
		int hash = hash(key);
		// if there is no element in table by index "hash"
		if (table[hash] == null) {
			return null;
		} else {
			// at least one element is present
			Node<K, V> tempNode = table[hash];
			// try to compare each key in existing list
			while (tempNode != null) {
				// in this case element has been found
				if (tempNode.key.equals(key)) {
					return tempNode.value;
				}
				// if not - take next element
				tempNode = tempNode.next;
			}
			// in this case there is no element with such key in list
			return null;
		}
	}
	/**
	 * Method displays all map
	 */
	public void display() {
		for (int i = 0; i < CAPACITY; i++) {
			if(table[i]!=null) {
				Node<K, V> node = table[i];
				while(node != null) {
					System.out.println("Key: " + node.key + "Value: " + node.value.toString());
					node = node.next;
				}
			}
		}
	}

}
