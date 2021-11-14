package com.bridgelabz.find_maximum;

public class FindMaximum {
	static String[] arr = { "Apple", "Peach", "Banana" };

	public static void main(String[] args) {
		String max;

		max = findMaximum(arr[0], arr[1], arr[2]);
		display();

		System.out.println("Maximum : " + max);

	}

	private static void display() {
		for (String a : arr) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}

	private static String findMaximum(String a, String b, String c) {
		String max;
		if (a.compareTo(b) > 0 || a.compareTo(c) > 0) {
			max = a;
		} else if (b.compareTo(c) > 0) {
			max = b;
		} else
			max = c;
		return max;
	}

}
