package com.bridgelabz.find_maximum;

public class FindMaximum {
	static Integer[] arr = { 1, 3, 2 };

	public static void main(String[] args) {
		int max;

		max = findMaximum(arr[0], arr[1], arr[2]);
		display();

		System.out.println("Maximum number : "+max);

	}

	private static void display() {
		for (int a : arr) {
			System.out.print(a + "  ");
		}
		System.out.println(); 
	}

	private static int findMaximum(Integer a, Integer b, Integer c) {
		int max;
		if (a.compareTo(b) > 0 || a.compareTo(c) > 0) {
			max = a;
		} else if (b.compareTo(c) > 0) {
			max = b;
		} else
			max = c;
		return max;
	}

}
