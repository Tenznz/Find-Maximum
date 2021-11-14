package com.bridgelabz.find_maximum;

public class FindMaximum<T extends Comparable<T>> {

	T arr[];

	public T FindMaximum() {
		return findMaximum(arr);
	}

	public <T extends Comparable<T>> T findMaximum(T[] arr) {
		T max = arr[0];
		if (arr[1].compareTo(max) > 0) {
			max = arr[1]; // y is the largest so far
			if (arr[2].compareTo(max) > 0) {
				max = arr[2]; // z is the largest now
				display(arr, max);
			}
		}
		return max;
	}

	private <T> void display(T[] a, T max) {
		System.out.println("Max of " + a[0] + ", " + a[1] + " and " + a[2] + " \n--> " + max);

	}

	public static void main(String[] args) {
		FindMaximum max = new FindMaximum();
		Integer[] intArray = { 1, 2, 3 };
		Float[] floatArray = { 1.1f, 1.2f, 1.3f };
		String[] strArray = { "Apple", "Banana", "Peach" };

		max.findMaximum(intArray);
		max.findMaximum(floatArray);
		max.findMaximum(strArray);

	}
}