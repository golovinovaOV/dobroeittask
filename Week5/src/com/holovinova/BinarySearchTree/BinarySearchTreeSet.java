package com.holovinova.BinarySearchTree;

/**
 * Custom realization of binary tree set
 * 
 * @author Golovinova Oksana
 *
 * @param <T>
 */
public class BinarySearchTreeSet<T extends Comparable<T>> {

	/**
	 * Link to root of a tree
	 */
	public Node root = null;

	/**
	 * Amount of element of tree
	 */
	private int size = 0;

	/**
	 * Node that will be store in a tree
	 * 
	 * @author Golovinova Oksana
	 *
	 */
	class Node {
		/**
		 * Data to store
		 */
		T data;

		/**
		 * Link to left subtree
		 */
		Node left;

		/**
		 * Link to left subtree
		 */
		Node right;

		/**
		 * Constructor for Node
		 * 
		 * @param data
		 */
		Node(T data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	/**
	 * Method adds new element to a tree
	 * @param element
	 * @return
	 */
	public boolean add(T element) {
		//if element already exist or equal to null
		if((element == null) || this.contain(element)) {
			return false;
		}
		// add new element
		this.root = addElement(this.root, element);
		// increment size
		size++;
		return true;
	}

	/**
	 * Recursive utility method for adding new element to a tree to right place
	 * @param root
	 * @param element
	 * @return
	 */
	private Node addElement(Node root, T element) {
		// in this case tree is empty
		if (root == null) {
			root = new Node(element);
			return root;
		}
		if (element.compareTo(root.data) < 0) {
			root.left = addElement(root.left, element);
		} else if (element.compareTo(root.data) > 0) {
			root.right = addElement(root.right, element);
		}
		return root;
	}

	/**
	 * Method that returns size of a tree
	 * @return
	 */
	public int size() {
		return this.size;
	}
	/**
	 * Method that checks if tree if empty
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Method that removes element from a tree
	 * @param element
	 * @return
	 */
	public boolean remove(T element) {
		// can't remove  null
		if (element == null) {
			return false;
		}
		// remove element
		root = deleteRec(root, element);
		// decrement size
		size--;
		return true;
	}

	/**
	 * Recursive utility method to delete a element from a tree	 
	 * @param root
	 * @param element
	 * @return
	 */
	private Node deleteRec(Node root, T element) {
		//in this case tree is empty
		if (root == null) {
			return root;
		}

		// check where to go next
		if (element.compareTo(root.data) < 0) {
			root.left = deleteRec(root.left, element);
		} else if (element.compareTo(root.data) > 0) {
			root.right = deleteRec(root.right, element);			
		} else {
			//in this case found node to be deleted
			
			// node with only one child or no child
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			
			// node with two children
			// find smallest in the right subtree
			root.data = minElement(root.right);

			// delete element that we moved to previous level of a tree  
			root.right = deleteRec(root.right, root.data);
		}
		
		return root;
	}
	
	/**
	 * Method that returns minimal element of a tree, using given node
	 * @param root
	 * @return
	 */
	public T minElement(Node root) {
		Node newRoot = root;
		T minValue = newRoot.data;
		// go through left side of a tree (while left element exist)
		while (newRoot.left != null) {
			minValue = newRoot.left.data;
			newRoot = newRoot.left;
		}
		return minValue;
	}

	
	/**
	 * Method that returns minimal element of a tree
	 * @param root
	 * @return
	 */
	public T minElement() {
		Node newRoot = this.root;
		T minValue = newRoot.data;
		// go through left side of a tree (while left element exist)
		while (newRoot.left != null) {
			minValue = newRoot.left.data;
			newRoot = newRoot.left;
		}
		return minValue;
	}
	
	
	/**
	 * Method that returns maximal element of a tree
	 * @param root
	 * @return
	 */
	public T maxElement() {
		Node newRoot = this.root;
		T maxValue = newRoot.data;
		// go through right side of a tree (while right element exist)
		while (newRoot.right != null) {
			maxValue = newRoot.right.data;
			newRoot = newRoot.right;
		}
		return maxValue;
	}
	
	
	/**
	 * Method that checks if tree contains element
	 * @param element
	 * @return
	 */
	public boolean contain(T element) {		
		boolean contain = false;
		Node newRoot = root;
		// go through all elements of a tree
		while (newRoot != null) {
			// in this case element had been found
			if (element.equals(newRoot.data)) {
				contain = true;
				break;
			}
			// decide where to go next
			
			// in this case comparable keys equals 
			// but it's not equal elements
			if(element.compareTo(newRoot.data) == 0) {
				break;
			}else if (element.compareTo(newRoot.data) < 0) {
				newRoot = newRoot.left;
			} else if (element.compareTo(newRoot.data) > 0) {
				newRoot = newRoot.right;
			}
			
		}
		return contain;
	}

	
	/**
	 * Method prints all elements of a tree in order
	 */
	public void print() {
		printElenemt(root);
	}
	
	/**
	 * Recursive utility method for printing elements 
	 * @param root
	 */
	private void printElenemt(Node root) {
		if (root != null) {
			printElenemt(root.left);
			System.out.println(root.data.toString());
			printElenemt(root.right);
		}
	}

}
