/** Program: DLL project
Written by: Julia Kelly
Program Description: interface for DLL 
Challenges: N/A
Time Spent: 1 min

Revision Log
Date:                   By:                  Action:
---------------------------------------------------
7/25/2020      			jk                   initial creation of file
9/9/2021				jk					 edited description

**/

public interface DLLADT<E> {

	abstract void addFirst(E data);	
	abstract void addLast(E data);
	abstract E first() ;
	abstract E last();
	abstract int size() ;
	abstract void removeFirst() ;	
	abstract void removeLast() ;
	abstract boolean isEmpty() ;
}

class DLL<E>{
	//node class
	private static class Node<E>{
		private E element;
		private Node<E> prev;
		private Node<E> next;
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}
		public E getElement() {return element;}
		public Node<E> getPrev() {return prev;}
		public Node<E> getNext() {return next;}
		public void setPrev(Node<E> p) {prev=p;}
		public void setNext(Node<E> n) {next=n;}
	}
	
	//necessary variables
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;
	
	//creates empty DLL
	public DLL() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}
	//returns size
	public int size() {return size;}
	
	//checks if LL is empty
	public boolean isEmpty() {return size == 0;}
	
	//returns fist element
	public E first() {
		if(isEmpty()) return null;
		return header.getNext().getElement();
	}
	
	//returns last element
	public E last() {
		if(isEmpty()) return null;
		return trailer.getPrev().getElement();
	}
	
	//add element to first
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	
	//add element to end
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	//remove and return first element
	public E removeFirst() {
		if(isEmpty()) return null;
		return remove(header.getNext());
	}
	
	//remove and return last element
	public E removeLast() {
		if(isEmpty()) return null;
		return remove(trailer.getPrev());
	}
	
	//adds node between nodes
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		// creates and links a new node
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	
	//removes given node from list and returns its element
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
}

	


