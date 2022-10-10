package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;

class Payprocess {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the values of array");
		for (int i = 0; i < size; i++)
			arr[i] = s.nextInt();
		System.out.println("enter the total no of targets that needs to be achieved");
		int Snotarget = s.nextInt();
		while (Snotarget-- > 0) {
			int count = 0;
			long target;
			System.out.println("enter the value of target");
			target = s.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum = sum + arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					count = 1;
					break;
				}
			}
			if (count == 0) {
				System.out.println(" Given target is not achieved ");
			}
		}
	}
}