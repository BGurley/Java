// Brandon Gurley
// 3-29-2023
// CSC-258
// Binary Search Tree  Main Program
//
//Requirements:
//	Must Handle Both Building and Searching



public class Main
	{
		public static void main(String[] args) {
			BST tree = new BST();
			
			//inserting nodes
			tree.insert(50);
			tree.insert(25);
			tree.insert(10);
			tree.insert(75);
			tree.insert(100);
			tree.insert(65);
			
			//initial BST
			System.out.println("Inital BST: ");
			tree.inorder();
			
			boolean result = tree.search(65);
			System.out.println("\nKey 65 was found in Binary Search Tree: " + result);
		
		}
	}