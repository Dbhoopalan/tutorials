package com.tutorial.arrays;

/**
 * Given a sorted array with duplicates, find the start and end indexes of a
 * given number<br><br>
 * 
 * <b>Example:</b><br>
 * 
 * Given int[] a = { 1, 2, 2, 3, 3, 3, 4, 4, 5 } and n = 3, <br> 
 * expected start and end indexes are 3 and 5 respectively.
 * 
 * @author rabhoopathyraju
 * 
 */
public class FindRange {

	public static void main(String[] args) {

		int[] a = { 1, 1, 2, 3, 3, 3, 5, 5, 5, 5, 5, 7, 7, 9, 9, 11, 11 };

		int start = -1, end = -1, length = a.length;

		int n = 5, mid = 0, low = 0, high = length - 1;

		boolean flag = false;

		// Using binary search to locate the number

		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] < n) {
				// Traverse to the right
				low = mid + 1;
			} else if (a[mid] > n) {
				// Traverse to the left
				high = mid - 1;
			} else {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Element found at index " + mid);
		} else {
			System.out.println("Element not found");
		}

		while (a[mid] == n) {
			if (mid == 0)
				break;
			mid = mid - 1;
		}
		if (mid == 0)
			start = mid;
		else
			start = ++mid;

		while (a[mid] == n) {
			if (mid == a.length - 1)
				break;
			mid = mid + 1;
		}

		if (mid != a.length - 1)
			end = --mid;
		else
			end = mid;

		System.out.println("\nStart : " + start + ", End : " + end);
	}
}