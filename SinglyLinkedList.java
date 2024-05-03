// Program: Singly Linked List
// Written by: Brandon Gurley
// Program Description: shows a working singly linked list
// File name: SinglyLinkedList.java
// File description: Singly Linked List



import java.io.*;
import java.util.LinkedList;


public class SinglyLinkedList {

	private ListNode head;
	
	// setting node data variable and next pointer
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
			
		}
	}
	
	public static void main(String[] args)
	{
		// variable initalizing and setting linked list node values
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		
		// Connecting the Nodes
		sll.head.next = second;
		second.next = third;
		third.next = fourth;

		ListNode current = sll.head;
		System.out.println("Singly Linked List: \n");
		
		// while loop to print linked list
		while (current != null)
		{
			System.out.print(current.data + " --> ");
			current = current.next;
		}
			
	}
}
