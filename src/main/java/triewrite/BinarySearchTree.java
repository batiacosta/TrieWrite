package triewrite;

import java.util.List;

//Binary Search Tree is same as Lab 7
public class BinarySearchTree<E extends Comparable <? super E>> {

	private Node<E> root = null;
	private int size = 0;

	public static class Node<E> {
		private E element;
		private Node<E> parent;
		private Node<E> left;
		private Node<E> right;

		Node(E element) {
			//write your code here
		}
		
		/**accessor methods*/
		E getElement() {
			//write your code here
			return null;
		}
		Node<E> getParent() {
			//write your code here
			return null;
		}
		Node<E> getLeft() { 
			//write your code here
			return null;
		}
		Node<E> getRight() {
			//write your code here
			return null;
		}	
		
		/**update methods */
		void setElement(E e) throws IllegalArgumentException { 
			//write your code here
		}
		void setParent(Node<E> parentNode) {	
			//write your code here
		}
		void setLeft(Node<E> left) {
			//write your code here
		}
		void setRight(Node<E> right) {
			//write your code here 
		}

		/**misc methods */
		int numChildren() {
			//write your code here
			return 0;
		}

	} //end Node class

	Node<E> root() {
		//write your code here
		return null;
	}
	
	int height(Node<E> node) {
		//write your code here
		return 0;	
	}
	
	int depth(Node<E> node) {
		//write your code here
		return 0;
	}
	
	/** Returns a list of nodes that are children of the given node */
	List<Node<E>> children(Node<E> node) {
		//write your code here
		return null;
	}
	
	/**Returns the node with minimum value starting downward from a node */
	Node<E> findMin(Node<E> node) {
		//write your code here
		return null;

	}
	
	public boolean isEmpty() {
		//write your code here
		return false;
	}
	
	public int size() {
		//write your code here
		return 0;
	}
	
	/** Inserts a new node with the element. Throws IllegalArgumentException if it already exists */
	public void insert (E element) throws IllegalArgumentException {
		//write your code here
	}

	/** Deletes a node */
	public void delete(Node<E> node) {
		//write your code here
	}



	/** Returns the node containing the element if found, else null */
	public Node<E> find(E element) {		
		//write your code here
		return null;
	}

	/** Returns a list of nodes using in-order traversal given the root node of the tree */
	public List <Node <E>> inorder(Node<E> root) {
		//write your code here
		return null;
	}

	/** Adds children of the subtree rooted at node to the given snapshot in inorder */
	private void inorderSubtree(Node<E> node, List<Node<E>> snapshot) {
		//write your code here
	}
}

