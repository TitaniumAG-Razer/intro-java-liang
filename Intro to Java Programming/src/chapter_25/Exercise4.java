package chapter_25;

/** Implement the postorder traversal WITHOUT using recursion. The method is in the
 * BST Class, this exercise tests if the results are the same. */
public class Exercise4 {
	public static void main(String[] args) {
		
		BST<String> tree = new BST<>();
		tree.insert("Nano");
		tree.insert("Yves");
		tree.insert("Austin");
		tree.insert("Manson");
		tree.insert("Tera");
		tree.insert("Charlie");
		tree.insert("Benjamin");
		tree.insert("Hera");
		
		// Should be the same
		tree.postorderIterative(tree.getRoot());
		System.out.println();
		tree.postorder();
	}
}
