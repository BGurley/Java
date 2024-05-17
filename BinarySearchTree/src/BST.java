// Brandon Gurley
// 3-29-2023
// CSC-258
// Binary Search Tree Program
//
//Requirements:
//	Must Handle Both Building and Searching


public class BST {
	// node class for node details
	class Node {
		int key;
		Node left, right;
		
		public Node(int data)
		{
			key = data;
			left = right = null;
		}
	}
	
	//Root Node
	Node root;
	
	//Creates an Initially empty tree
	BST()
	{
		root = null;
	}
	
	// node insertion
	void insert(int key)
	{
		root = insert_Recursive(root, key);
	}
	
	Node insert_Recursive(Node root, int key) {
		// if tree is empty
		if (root == null) {
			root = new Node(key);
			return root;
		}
		// traverse the tree
		if (key < root.key) // inserts in left subtree
			root.left = insert_Recursive(root.left, key);
		else if (key > root.key) // inserts in right subtree
			root.right = insert_Recursive(root.right, key);
		//returns pointer
		return root;
	}
	// in order traversal to show the BST
	void inorder() {
		inorder_Recursive(root);
	}
	
	void inorder_Recursive(Node root) {
		if (root != null) 
		{
			inorder_Recursive(root.left);
			System.out.print(root.key + " ");
			inorder_Recursive(root.right);
		}
	}
	
	boolean search(int key) {
		root = search_Recursive(root, key);
		if(root != null)
			return true;
		else
			return false;
	}
	
	Node search_Recursive(Node root, int key)
	{
		// base cases
		
		//if the root is null or the key is at the root
		if (root == null || root.key == key)
			return root;
		
		//if the value is greater than roots key
		if (root.key > key)
			return search_Recursive(root.left, key);
		
		//if value is less than roots key
		return search_Recursive(root.right, key);
	}
}
