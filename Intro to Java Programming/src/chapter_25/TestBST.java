package chapter_25;

public class TestBST {
	public static void main(String[] args) {
		
		BST<Integer> tree = new BST<>();
		
		tree.insert(0);
		tree.insert(5);
		tree.insert(10);
		tree.insert(-2);
		tree.insert(-6);
		tree.insert(22);
		tree.insert(-1);
		tree.insert(-8);
		tree.insert(11);
		
		System.out.print("Inorder (sorted): ");
		tree.inorder();
		System.out.print("\nPostorder (sorted): ");
		tree.postorder();
		System.out.print("\nPreorder (sorted): ");
		tree.preorder();
		System.out.print("\nBreadth First Traversal: ");
		tree.breadthFirstTraversal();
		
		System.out.println("\nThe number of nodes is : " + tree.getSize());
		System.out.println("The height of the tree is : " + tree.findHeight());
		
	}
}
