package com.tutorial.datastructures.linkedlist;

/**
 * 
 * @author rabhoopathyraju
 * testing
 * 
 */
class Node {

	private int data = 0;

	public Node next = null;

	public int getData() {
		return this.data;
	}

	Node(int data) {
		this.data = data;
	}
}

public class LinkedList {

	public Node head = null;
	public Node last = null;

	/**
	 * Method to add a number to linked list
	 * 
	 * @param number
	 *            - Number to be added
	 */
	public void add(int number) {
		Node node = new Node(number);

		if (head == null) {
			head = node;
			last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	/**
	 * Display all the values starting from head
	 */
	public void display() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node node = head;
			while (node != null) {
				System.out.print(node.getData() + " ");
				node = node.next;
			}
		}
		System.out.println("\n");
	}

	/**
	 * Method to find nth element from last
	 * 
	 * @param position
	 *            - Position from last
	 * @return
	 */
	public int getNthElementFromLast(int position) {

		if (head == null) {
			return -1;
		}

		Node p1 = head, p2 = head;

		// Move p2 to n-1 positions
		for (int i = 0; i < position - 1; i++) {
			if (p2 == null) {
				System.out.println("Enter a valid index");
				return -1;
			}
			p2 = p2.next;
		}

		// Move p1 and p2 to one position until p2 reaches the end
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}

		return p1.getData();
	}

	/**
	 * Display values in reverse order
	 */
	public void displayReverseOrder() {
		displayInReverseOrder(head);
	}

	/**
	 * Display values in reverse order. In recursive method.
	 * 
	 * @param node
	 *            - Head Node
	 */
	private void displayInReverseOrder(Node node) {
		if (node == null)
			return;

		displayInReverseOrder(node.next);
		System.out.print(node.getData() + " ");
	}

	/**
	 * <b>Reverse a linked list</b>
	 */
	public void reverse() {

		// If linked list is empty
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		// If linked list has only one element
		if (head.next == null) {
			System.out.println(head.getData());
			return;
		}

		Node prev = head, current = head.next, temp = current;

		while (temp != null) {
			if (current != null)
				current = current.next;
			temp.next = prev;
			prev = temp;
			temp = current;
		}

		last = head;
		last.next = null;
		head = prev;
	}
}
