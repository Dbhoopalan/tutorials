package com.tutorial.arrays;

import java.util.Arrays;

/**
 * <b>Problem:</b><br>
 * Given two sorted integer arrays A and B, merge the contents of B into A
 * without using extra space. Assume that A has enough space for contents of B.
 * 
 * <br>
 * <br>
 * <b>Note:</b><br>
 * This code assumes that A has blank spaces exactly as same as of size B
 * 
 * @author rabhoopathyraju
 * 
 */
public class MergeIntoArray {

	public static void main(String[] args) {
		int[] a = { 1, 12, 13, 14, 15, 0, 0, 0, 0 };
		int[] b = { 6, 6, 6, 6 };
		mergeArrays(a, b);
	}

	public static void mergeArrays(int[] a, int[] b) {

		if (a == null || b == null) {
			System.out.println("Invalid input : one of the array is null");
			return;
		}

		if (a.length < b.length) {
			System.out.println("Second array is larger than first");
		}

		/*
		 * j - size of b, i - size of contents in a, ptr - last index of a
		 */
		int ptr = a.length - 1, j = b.length - 1, i = (ptr - j) - 1;

		while (j >= 0 && i >= 0) {
			if (b[j] > a[i]) {
				a[ptr--] = b[j];
				j--;
			} else {
				a[ptr--] = a[i];
				i--;
			}
		}

		if (j > 0) {
			while (j >= 0) {
				a[ptr--] = b[j--];
			}
		} else if (a[0] > b[0]) {
			a[0] = b[0];
		}
		System.out.println(Arrays.toString(a));
	}
}
