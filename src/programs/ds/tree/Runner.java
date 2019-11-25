package programs.ds.tree;

public class Runner {
	
	public static void main(String args[]) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.createRoot(5);
		
		tree.addLeftChild(5, 14);
		tree.addRightChild(5, 25);
		tree.addLeftChild(14, 17);
		tree.addRightChild(14, 33);
		tree.addLeftChild(25, 21);
		tree.addRightChild(25, 44);
		tree.addLeftChild(33, 9);
		tree.addRightChild(33, 4);
		
		System.out.println("PreOrder");
		tree.preOrderTraversal();
		
		System.out.println("InOrder");
		tree.inOrderTraversal();
		
		System.out.println("PostOrder");
		tree.postOrderTraversal();
		
		
		
	}

}
