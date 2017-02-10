package chapter_25;

public interface Tree<E> extends Iterable<E> {
	
	/** Return true if the element is in the tree */
	public boolean search(E e);
	
	/** Insert element e into the binary search tree.
	 * Return true if the element is inserted successfully. */
	public boolean insert(E e);
	
	/** Delete the specified element from the tree. Return true
	 * if the element was successfully deleted. */
	public boolean delete(E e);
	
	/** Inorder traversal */
	public void inorder();
	
	/** Postorder traversal */
	public void postorder();
	
	/** Preorder traversal */
	public void preorder();
	
	/** Get the number of nodes in the tree */
	public int getSize();
	
	/** Return true if the tree is empty */
	public boolean isEmpty();
}

