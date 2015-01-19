package com.tutorial.arrays;

/**
 * Given an integer array, find the leaders in the array. An element is a leader
 * if it is greater than all the elements to its right. The rightmost element is
 * always a leader.<br>
 * <br>
 * 
 * <b>Example:</b><br>
 * int[] a = { 3, 4, 7, 5, 2, 3, 1}, the leaders are 1, 3, 5 and 7
 * 
 * @author rabhoopathyraju
 * 
 */
public class FindLeaders {

	public static void main(String[] args) {

		int[] a = { 3, 4, 7, 5, 2, 3, 1 };

		printLeaders(a);
		System.out.println("\n");

		int length = a.length;
		printLeaders(a, length - 1, a[length - 1] - 1);
	}

	/**
	 * Print leaders from left to right using recursion
	 * 
	 * @param a
	 *            - Integer array
	 * @param length
	 *            - Length of the array (starting from 0)
	 * @param leader
	 *            - Default leader : lastElement - 1
	 */
	public static void printLeaders(int[] a, int length, int leader) {
		if (length < 0) {
			return;
		}
		if (a[length] > leader) {
			leader = a[length];
			printLeaders(a, --length, leader);
			System.out.print(leader + " ");
		} else {
			printLeaders(a, --length, leader);
		}
	}

	/**
	 * Prints the leaders in reverse
	 * 
	 * @param a
	 *            - Integer array
	 */
	public static void printLeaders(int[] a) {
		int lastLeader = a[a.length - 1];

		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] > lastLeader) {
				System.out.print(lastLeader + " ");
				lastLeader = a[i];
			}
		}
		System.out.print(lastLeader + " ");
	}
}
