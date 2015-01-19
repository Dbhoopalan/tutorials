package com.tutorial.datastructures.linkedlist;

import java.util.Arrays;

public class LinkedList_FindNthPositionFromLast {

	public static void main(String[] args) {

		int n = 4;

		LinkedList list = new LinkedList();
		list.add(8);
		list.add(0);
		list.add(5);
		list.add(9);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(10);

		System.out.println("Linked List");
		list.display();

		System.out.println(n + "th position from last : " + list.getNthElementFromLast(n));

		System.out.println("\nReverse order");
		list.displayReverseOrder();

		System.out.println("\n\nReversing list");
		list.reverse();
		list.display();

		Arrays.sort(new int[90]);

	}
}
