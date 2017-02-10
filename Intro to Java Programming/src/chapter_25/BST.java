package chapter_25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {

	private TreeNode<E> root;
	private int size = 0;

	/** Create a default binary search tree */
	public BST() {
	}

	/** Create a binary search tree from an array of objects */
	public BST(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			insert(objects[i]);
	}

	@Override /** Returns true if the element is in the tree */
	public boolean search(E e) {

		TreeNode<E> current = root;

		while (current != null) {
			if (e.compareTo(current.getElement()) > 0) // what we want > current
																		// element
				current = current.getRightChild(); // go right
			else if (e.compareTo(current.getElement()) < 0) // what we want <
																			// current element
				current = current.getLeftChild();
			else
				return true; // found
		}

		return false; // not found
	}

	@Override /**
					 * Insert element e into the binary search tree. The method
					 * returns true if the element is inserted successfully.
					 */
	public boolean insert(E e) {
		if (root == null)
			root = createNewNode(e);
		else {
			// Locate the parent node first
			TreeNode<E> parent = null;
			TreeNode<E> current = root;

			while (current != null) {
				if (e.compareTo(current.getElement()) < 0) { // current node > what
																			// we want to insert
					parent = current;
					current = current.getLeftChild();
				} else if (e.compareTo(current.getElement()) > 0) { // current node
																						// < what we
																						// want to
																						// insert
					parent = current;
					current = current.getRightChild();
				} else
					return false; // Duplicates not allowed
			}

			// Create the new node and attach it to the parent node
			if (e.compareTo(parent.getElement()) < 0) // inserted node < parent
				parent.setLeftChild(createNewNode(e));
			else // inserted node > parent
				parent.setRightChild(createNewNode(e));
		}
		size++;
		return true;
	}

	/** Create a new TreeNode with the parameter data */
	protected TreeNode<E> createNewNode(E e) {
		return new TreeNode<>(e);
	}

	@Override /** Inorder traversal from the root */
	public void inorder() {
		inorder(root);
	}

	/** Inorder traversal from a subtree */
	public void inorder(TreeNode<E> root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}
	
	/** Inorder traversal WITHOUT using recursion */
	public void inorderIterative(TreeNode<E> root) {
		if (root == null)
			return;
		
		Stack<TreeNode<E>> stack = new Stack<>();
		TreeNode<E> currentNode = root;
		
		while (!stack.isEmpty() || currentNode != null) {
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			else {
				currentNode = stack.pop();
				System.out.print(currentNode.element + " ");
				currentNode = currentNode.right;
			}
		}
	}

	@Override /** Postorder traversal from the root */
	public void postorder() {
		postorder(root);
	}

	/** Postorder traversal from a subtree */
	public void postorder(TreeNode<E> root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element + " ");
	}

	/** Postorder traversal WITHOUT using recursion */
	public void postorderIterative(TreeNode<E> root) {
		if (root == null)
			return;
		
		Stack<TreeNode<E>> stack1 = new Stack<>();
		Stack<TreeNode<E>> stack2 = new Stack<>();
		TreeNode<E> currentNode = root;
		stack1.push(currentNode);
		
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
			currentNode = stack2.peek();
			if (currentNode.left != null)
				stack1.push(currentNode.left);
			if (currentNode.right != null)
				stack1.push(currentNode.right);
		}
		
		// Print contents of second stack
		while (!stack2.isEmpty()) {
			currentNode = stack2.pop();
			System.out.print(currentNode.element + " ");
		}
	}
	
	@Override /** Preorder traversal from the root */
	public void preorder() {
		preorder(root);
	}

	/** Preorder traversal from a subtree */
	public void preorder(TreeNode<E> root) {
		if (root == null)
			return;
		System.out.print(root.element + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	/** Preorder traversal WITHOUT using recursion */
	public void preorderIterative(TreeNode<E> root) {
		if (root == null)
			return;
		
		Stack<TreeNode<E>> stack = new Stack<>();
		TreeNode<E> currentNode = root;
		stack.push(currentNode);
		
		while (!stack.isEmpty()) {
			currentNode = stack.pop();
			System.out.print(currentNode.element + " ");
			if (currentNode.right != null) 
				stack.push(currentNode.right);
			if (currentNode.left != null) 
				stack.push(currentNode.left);
		}
	}

	/** Displays the nodes in a breadth-first traversal */
	public void breadthFirstTraversal() {
		List<TreeNode<E>> list = new LinkedList<>();
		TreeNode<E> currNode;

		if (root == null)
			return;
		else
			list.add(root);

		do {
			currNode = list.remove(0);
			System.out.print(currNode.element + " ");

			if (currNode.left != null)
				list.add(currNode.left);

			if (currNode.right != null)
				list.add(currNode.right);
			// Add the node to the list
		} while (!list.isEmpty());
	}

	/** Returns the height of this binary tree */
	int findHeight() {
		return findHeight(root);
	}

	/** Returns the height of a tree, starting at the parameter */
	int findHeight(TreeNode<E> node) {
		if (node == null)
			return -1;

		int leftSubHeight = findHeight(node.left);
		int rightSubHeight = findHeight(node.right);

		if (leftSubHeight > rightSubHeight) {
			return leftSubHeight + 1;
		} 
		else {
			return rightSubHeight + 1;
		}
	}

	/** Returns true if the tree is a full binary tree */
	public boolean isFullBST() {
		
		int depth = findHeight();
		boolean isFull;
		isFull = (size == (int)(Math.pow(2, depth)) - 1) ? true: false;		
		return isFull;
	}
	
	/** Gets the number of leaf nodes in the tree */
	public int getNumberOfLeaves() {
		return getNumberOfLeaves(root);
	}
	
	/** Private helper method for above */
	private int getNumberOfLeaves(TreeNode<E> root) {
		if (root == null)
			return 0;
		else if (root.left == null && root.right == null)
			return 1;
		else
			return getNumberOfLeaves(root.left) + getNumberOfLeaves(root.right);
	}
	
	/** Gets the number of non-leaf nodes in the tree */
	public int getNumberOfNonLeaves() {
		return getNumberOfNonLeaves(root);
	}
	
	/** Private helper method for above */
	private int getNumberOfNonLeaves(TreeNode<E> root) {
		return getSize() - getNumberOfLeaves(root);
	}
	
	/**
	 * This inner class is static, because it does not access any instance
	 * members defined in its outer class.
	 */
	public static class TreeNode<E extends Comparable<E>> {

		private E element;
		private TreeNode<E> left;
		private TreeNode<E> right;

		TreeNode(E e) {
			element = e;
		}

		/** Get current node data */
		public E getElement() {
			return element;
		}

		/** Get current node's right child */
		public TreeNode<E> getRightChild() {
			return right;
		}

		/** Get current node's left child */
		public TreeNode<E> getLeftChild() {
			return left;
		}

		/** Set the current node's left child to the parameter */
		public boolean setLeftChild(TreeNode<E> node) {
			if (node.element.compareTo(this.element) > 0) // node data > current
																			// data
				return false;
			this.left = node;
			return true;
		}

		/** Set the current node's right child to the parameter */
		public boolean setRightChild(TreeNode<E> node) {
			if (node.element.compareTo(this.element) < 0) // node data < current
																			// data
				return false;
			this.right = node;
			return true;
		}
	}

	@Override /** Get the number of nodes in the tree */
	public int getSize() {
		return size;
	}

	/** Returns the root of the tree */
	public TreeNode<E> getRoot() {
		return root;
	}

	/** Returns a path from the root leading to the specified element */
	public ArrayList<TreeNode<E>> path(E e) {

		ArrayList<TreeNode<E>> list = new ArrayList<>();

		TreeNode<E> current = root;

		while (current != null) {
			list.add(current);

			if (e.compareTo(current.element) < 0) {
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				current = current.right;
			} else
				break;
		}

		return list;
	}

	/** Delete a node from the BST. Returns true if deletion is successful. */
	@Override
	public boolean delete(E e) {

		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		while (current != null) {
			if (e.compareTo(current.element) < 0) { // what we want < current
				parent = current;
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				parent = current;
				current = current.right;
			} else
				break; // element is in the tree pointed at by current
		}

		if (current == null)
			return false;

		// Case 1: current has no left child
		if (current.left == null) {
			// Connect the parent with the right child of the current node
			if (parent == null) {
				root = current.right;
			} else {
				if (e.compareTo(parent.element) < 0)
					parent.left = current.right;
				else
					parent.right = current.right;
			}
		} else { // Case 2: Current node has a left child.
			// Locate rightmost node in the left subtree.

			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;

			while (rightMost.right != null) {
				parentOfRightMost = rightMost;
				rightMost = rightMost.right; // keep going right
			}

			// Replace element in current by rightMost
			current.element = rightMost.element;

			// Eliminate rightmost node
			if (parentOfRightMost.right == rightMost)
				parentOfRightMost.right = rightMost.left;
			else
				// Case: parentOfRightMost == current
				parentOfRightMost.left = rightMost.left;
		}

		size--;
		return true;
	}

	/** Remove all elements from the tree */
	public void clear() {
		root = null;
		size = 0;
	}
	
	@Override /** Clones the tree */
	public BST<E> clone() {
		if (root == null)
			return null;
		
		BST<E> copyTree = new BST<>();
		
		List<TreeNode<E>> list = new LinkedList<>();
		TreeNode<E> current = root;
		list.add(current);

		while (!list.isEmpty()) {
			current = list.remove(0);
			copyTree.insert(current.element);
			if (current.left != null)
				list.add(current.left);
			if (current.right != null)
				list.add(current.right);
		}
		
		copyTree.size = this.size;
		return copyTree;
	}

	/** Tests if two trees are equal */
	public boolean equals(BST<E> tree) {
		
		if (this.size != tree.size)
			return false;
		
		Iterator<E> iter1 = this.iterator();
		Iterator<E> iter2 = tree.iterator();
		
		// Size is the same so don't need to worry about "out of bounds"
		while (iter1.hasNext()) {
			if (iter1.next().compareTo(iter2.next()) != 0)
				return false;
		}
		
		return true; 	
	}
	
	public Iterator<E> iterator() {
		return new InorderIterator();
	}

	// Inner class InorderIterator
	private class InorderIterator implements java.util.Iterator<E> {
		// Store the elements in a list
		private java.util.ArrayList<E> list = new java.util.ArrayList<>();
		private int current = 0; // Point to the current element in list

		public InorderIterator() {
			inorder(); // Traverse binary tree and store elements in list
		}

		/** Inorder traversal from the root */
		private void inorder() {
			inorder(root);
		}

		/** Inorder traversal from a subtree */
		private void inorder(TreeNode<E> root) {
			if (root == null)
				return;
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}

		@Override /** More elements for traversing? */
		public boolean hasNext() {
			if (current < list.size())
				return true;

			return false;
		}

		@Override /** Get the current element and move to the next */
		public E next() {
			return list.get(current++);
		}

		@Override /** Remove the current element */
		public void remove() {
			delete(list.get(current)); // Delete the current element
			list.clear(); // Clear the list
			inorder(); // Rebuild the list
		}
	}
	
	public Iterator<E> preIterator() {
		
		return new PreorderIterator();
	}
	// Inner class PreorderIterator
	private class PreorderIterator implements java.util.Iterator<E> {
		// Store the elements in a list
		private java.util.ArrayList<E> list = new java.util.ArrayList<>();
		private int current = 0; // Point to the current element in list

		public PreorderIterator() {
			preorder(); // Traverse binary tree and store elements in list
		}

		/** Preorder traversal from the root */
		private void preorder() {
			preorder(root);
		}

		/** Preorder traversal from a subtree */
		private void preorder(TreeNode<E> root) {
			if (root == null)
				return;
			list.add(root.element);
			preorder(root.left);
			preorder(root.right);
		}

		@Override /** More elements for traversing? */
		public boolean hasNext() {
			if (current < list.size())
				return true;

			return false;
		}

		@Override /** Get the current element and move to the next */
		public E next() {
			return list.get(current++);
		}

		@Override /** Remove the current element */
		public void remove() {
			delete(list.get(current)); // Delete the current element
			list.clear(); // Clear the list
			preorder(); // Rebuild the list
		}
	}
	
}
