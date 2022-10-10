package com.currencydenomination;

import java.util.Arrays;
import java.util.Scanner;

public class Currency {
	public static void main(String[] args) throws Exception {
		int size;
		System.out.println("Enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int denominationvalue[] = new int[size];
		int i = 0;
		for (i = 0; i < size; i++) {
			System.out.println("Enter the currency denomination values");
			Scanner s = new Scanner(System.in);
			denominationvalue[i] = sc.nextInt();
		}
		int amount;
		System.out.println("enter the amount you want to pay");
		Scanner s = new Scanner(System.in);
		amount = s.nextInt();
		int notes[] = new int[size];
		Arrays.sort(denominationvalue);
		reverse(denominationvalue);
		for (i = 0; i < size; i++) {
			if (amount >= notes[i]) {
				notes[i] = amount / denominationvalue[i];
				amount = amount % denominationvalue[i];
			}
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int j = 0; j < size; j++) {

			System.out.println(denominationvalue[j] + ":" + notes[j]);
		}
	}

	private static void reverse(int[] denominationvalue) {
		int n = denominationvalue.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = denominationvalue[i];
			denominationvalue[i] = denominationvalue[n - i - 1];
			denominationvalue[n - i - 1] = temp;

		}
	}

}
