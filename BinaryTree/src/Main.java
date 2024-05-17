// Brandon Gurley
// 3-18-2023
// Functioning Binary Tree Program
// CSC 258
// Time to Complete: 2 Hours

import java.util.LinkedList;
import java.util.Queue;

class Node{
		int data;
		Node left, right;
		
		public Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	}
	class BinaryTree{
		Node root;
		
		// method to add node to binary tree
		public void addNode(int data) {
			Node newNode = new Node(data);
			
			if (root == null) {
				root = newNode;
			} 
			else {
				Node focusNode = root;
				Node parent;
				
				while(true) {
					parent=focusNode;
					
					if(data < focusNode.data) {
						focusNode = focusNode.left;
						if(focusNode == null) {
							parent.left = newNode;
							return;
						}
					}
					else
					{
						focusNode = focusNode.right;
						if (focusNode == null) {
							parent.right = newNode;
							return;
						}
						
					}
				}
			}
			
		}
		
		// method for deleting a node from the binary tree
		static Node delete(Node root, int data)
		{
			if (root == null)
				return null;
			
			if (root.left == null && root.right == null) {
					return root.data == data ? root : null;			
			}
			Node keyNode = null, temp = null, last = null;
			Queue<Node> q = new LinkedList<>();
			q.offer(root);

			while(!q.isEmpty()) {
				temp  =q.poll();
				
				if(temp.data == data)
					keyNode=temp;
				
				if(temp.left != null)
				{
					last = temp;
					q.offer(temp.left);
				}
				
				if(temp.right != null) {
					last = temp;
					q.offer(temp.right);
				}
			}
			if(keyNode != null) {
				keyNode.data = temp.data;
				if(last.right == temp)
				{
					last.right = null;
				}
				else	
					last.left = null;
			}
			return root;
		}
	}	

	
	// main method
	public class Main{
		public static void main(String[] args)
		{
			BinaryTree tree = new BinaryTree();
			
			tree.addNode(10);
			tree.addNode(5);
			tree.addNode(15);
			
			System.out.println(tree);
		}
		
		
	}

	
	
	

