package chapter_25;

/** Test the clone and equals methods **/
public class Exercise9 {
	public static void main(String[] args) {
		
		BST<String> tree1 = new BST<>();
		BST<String> tree2 = new BST<>();
		
		// Should be the same
		if (tree1.equals(tree2))
			System.out.println("The two trees are equal.");
		else
			System.out.println("The two trees are not the same.");
		
		tree1.insert("Sarah");
		
		// Should be different
		if (tree1.equals(tree2))
			System.out.println("The two trees are equal.");
		else
			System.out.println("The two trees are not the same.");
		
		tree2.insert("Sarah");
		tree1.insert("Brian");
		tree2.insert("Brian");
		
		// Should be same
		if (tree1.equals(tree2))
			System.out.println("The two trees are equal.");
		else
			System.out.println("The two trees are not the same.");
		
		// Now testing the clone method
		BST<String> tree3 = tree1.clone();
		
		tree1.inorder();
		System.out.println();
		tree3.inorder();
		System.out.println();
		System.out.println(tree1.getSize());
		System.out.println(tree3.getSize());
	}
}
