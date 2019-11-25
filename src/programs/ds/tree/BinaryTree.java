package programs.ds.tree;

import java.util.Queue;

public class BinaryTree { 
	protected Node root;
	
	
	
		
	public Node createRoot(Object data) {
		
		Node node = new Node(data);
		root = node;	
		
		return root;
		
	}
	
	
	
	public boolean addLeftChild(Object key,Object data) {
		
		if(root == null)
			createRoot(data);
		
		Node keyNode = breadthFirstSearch(key);
		if(keyNode == null)
			return false;
		
		keyNode.left = new Node(data);
		return true;
		
		
		
	}
	
	public boolean addRightChild(Object key, Object data) {
		
		if(root == null)
			createRoot(data);
		
		Node keyNode = breadthFirstSearch(key);
		if(keyNode == null)
			return false;
		
		keyNode.right = new Node(data);
		return true;
		
		
	}
	
	
	public void preOrderTraversal( ) {
		preOrderTraversal(root);
	}
	
	private void preOrderTraversal(Node root) {
		
	 
	 if(root ==null) 
		 return;

	 visitNode(root);
	 preOrderTraversal(root.left);
	 preOrderTraversal(root.right);		
		
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	private void inOrderTraversal(Node root) {
	
		if(root ==null) 
			 return;
		
		
		inOrderTraversal(root.left);
		visitNode(root);
		inOrderTraversal(root.right);
		
		
	}
	
	
	public void postOrderTraversal() {
		postOrderTraversal(root);
	}
	
	private void postOrderTraversal(Node root) {
		
		if(root ==null) 
			 return;
		
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		visitNode(root);
		
		
		
		
	}
	
	public Node breadthFirstSearch(Object key) {
		
		if(root == null)
			return null;
		
		Queue<Node> q = new java.util.LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
		
	      Node n = q.remove();
		  
	      if(n.data.equals(key)) {
	    	  return n;
	      }
	      
	     
	      if(n.left!=null)
	    	  q.add(n.left);
	      
	      if(n.right!=null)
	         q.add(n.right);			
	      
			
		}
		
		return null; //not found
		
	}
	
	
	public void depthFirstTraversal() {
		
		
	}
	
	public void breadthFirstTraversal() {
		
		
	}
	
	
	private void visitNode(Node n) {
		
		System.out.println(n.data);
		
	}
	
		
	private class Node{
		
		Object data;
		Node left,right;
		
		Node(Object data){
			this.data=data;
		}
			
	}

}
