package com.bridgelabz.find_maximum;

public class FindMaximum {
	static Float[] arr = { 1.3f, 1.1f, 1.2f };

	public static void main(String[] args) {
		Float max;

		max = findMaximum(arr[0], arr[1], arr[2]);
		display();

		System.out.println("Maximum number : "+max);

	}

	private static void display() {
		for (Float a : arr) {
			System.out.print(a + "  ");
		}
		System.out.println(); 
	}

	private static float findMaximum(Float a, Float b, Float c) {
		Float max;
		if (a.compareTo(b) > 0 || a.compareTo(c) > 0) {
			max = a;
		} else if (b.compareTo(c) > 0) {
			max = b;
		} else
			max = c;
		return max;
	}

}
