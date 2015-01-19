package com.tutorial.arrays;

/**
 * Given a set of stock prices in an integer array, find the best possible
 * buying and selling prices<br><br><b>
 * 
 * Example:</b><br>
 * int[] a = {12, 11, 13, 10, 9, 11, 12}, expected buying and selling prices are
 * 9 and 12. 
 * 
 * @author rabhoopathyraju
 * 
 */
public class StockMarket {

	public static void main(String[] args) {

		int[] a = { 80, 29, 88, 70, 93, 73, 89, 63, 80, 23, 88 };

		if (a.length < 2) {
			System.out.println("Need more prices");
			return;
		}

		int min = a[0], max = a[1], diff = 0, start = min, profit = 0;

		profit = max - min;

		for (int i = 1; i < a.length; i++) {
			diff = a[i] - min;

			if (a[i] < min) {
				min = a[i];
			}

			if (diff > profit) {
				start = min;
				max = a[i];
				profit = diff;
			}
		}

		if (profit > 0) {
			System.out.println("Buy at " + start + " and sell at " + max
					+ " for a profit of " + profit);
		} else {
			System.out.println("No profit with these prices");
		}
	}
}
