package com.bridgelabz.find_maximum;

import java.util.Scanner;

public class FindMaximum<T extends Comparable<T>> {

	T arr[];

	public T FindMaximum() {
		return findMaximum(arr);
	}

	public <T extends Comparable<T>> T findMaximum(T[] arr) {
		T max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].compareTo(max) > 0) {
				max = arr[i];
			}
		}
		display(arr, max);
		return max;
	}

	private static <T extends Comparable<T>> void display(T[] arr,T max) {

		for (T a : arr) {
			System.out.print(a+"  ");
		}
		System.out.println("max ->"+max);  
	}

	public static void main(String[] args) {
		FindMaximum max = new FindMaximum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Type : \n\t1.Integer\n\t2.Float\n\t3.String");
		int input = sc.nextInt();
		System.out.print("Enter total number you want :");
		int n = sc.nextInt();
		int i = 0;
		switch (input) {
		case 1:
			Integer[] intArray = new Integer[n];
			while (i < n) {
				intArray[i] = sc.nextInt();
				i++;
			}
			max.findMaximum(intArray);
			break;
		case 2:
			Float[] floatArray = new Float[n];
			while (i < n) {
				floatArray[i] = sc.nextFloat();
				i++;
			}
			max.findMaximum(floatArray);
			break;
		case 3:
			String[] strArray = new String[n];
			while (i < n) {
				strArray[i] = sc.next();
				i++;
			}
			max.findMaximum(strArray);
			break;
		default:
			System.out.println("Enter the valid number");
		}
	}
}