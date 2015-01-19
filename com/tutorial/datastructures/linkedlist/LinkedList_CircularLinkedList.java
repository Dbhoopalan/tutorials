package com.tutorial.datastructures.linkedlist;

public class LinkedList_CircularLinkedList {

	public static void main(String[] args) {

		MyLinkedList l = new MyLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);

		// l.display();

		isCircularList(l);
	}

	/**
	 * Have two pointers. Move 1st pointer by one position and 2nd pointer by
	 * two. When these two pointers meet, reset 1st pointer to head. Now move
	 * both the pointers by one position. Again when the intersection is where
	 * these two pointers meet.
	 * 
	 * @param l
	 */
	public static void isCircularList(MyLinkedList l) {
		MyNode n1 = l.first;
		MyNode n2 = l.first;

		int temp = 0;
		while (true) {
			n1 = n1.next;
			if (temp == 1) {
				n2 = n2.next;
			} else {
				n2 = n2.next.next;
			}
			System.out.println(n1.data + ", " + n2.data);
			if (n1 == n2) {
				if (temp == 1) {
					break;
				} else {
					temp = 1;
					n1 = l.first;
				}
			}
		}
	}
}

class MyNode {
	int data = 0;
	MyNode next = null;
}

class MyLinkedList {

	MyNode first = null, last = null, temp = null;

	public void add(int n) {
		MyNode node = new MyNode();
		node.data = n;

		if (first == null) {
			first = node;
			last = node;
		} else {
			last.next = node;
			last = node;
		}

		/*
		 * Below code is to create a circular linked list.
		 */
		if (n == 30) {
			temp = node;
		} else if (n == 80) {
			last.next = temp;
		}

	}

	public void display() {
		MyNode node = first;
		while (node != null) {
			System.out.println(node + " --> " + node.data + " ---> "
					+ node.next);
			node = node.next;
		}
	}
}
