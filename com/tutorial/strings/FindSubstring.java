package com.tutorial.strings;

/**
 * Given two strings str and sub, find if sub is substring of str
 * 
 * @author rabhoopathyraju
 * 
 */
public class FindSubstring {

	public static void main(String[] args) {

		String str = "rajbabartxbaty", sub = "bat";

		boolean notFound = false;

		int length = str.length();

		for (int i = 0; i < length; i++) {
			notFound = false;
			for (int j = 0; j < sub.length(); j++) {
				if (str.charAt(i + j) != sub.charAt(j)) {
					notFound = true;
					break;
				}
			}
			if (!notFound) {
				System.out.println(sub + " is a substring of " + str);
				return;
			}
		}

		System.out.println("Substring not found !");
	}

}
