package com.tutorial.strings;

/**
 * Find the index of the given substring without using indexOf()
 * 
 * @author rabhoopathyraju
 * 
 */
public class FindSubstringIndex {

	public static void main(String[] args) {

		String str = "Thodahury hus Thursday";

		String sub = "hurs";

		int index = findIndex(str, sub);

		if (index < 0) {
			System.out.println("Substring not found");
		} else {
			System.out.println("'" + sub + "' starts at index " + index);
		}
	}

	static int findIndex(String str, String sub) {

		if (sub.length() > str.length()) {
			System.out.println("Invalid substring");
			return -1;
		}

		char[] c1 = str.toCharArray();
		char[] c2 = sub.toCharArray();

		int i = 0, j = 0, index = -1;

		while (i < c1.length) {
			if (c2[j] == c1[i]) {
				index = i;
				while (j < c2.length) {
					if (c1[i] == c2[j]) {
						i++;
						j++;
					} else {
						i = index + 1;
						j = 0;
						index = -1;
						break;
					}
				}
				if (index > 0) {
					return index;
				}
			} else {
				i++;
			}
		}
		return index;
	}
}
