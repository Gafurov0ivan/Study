package com.gafur.homework.week_1;

public class ArrayMinThree {
	public static void main(String[] args) {
		int[] array = { 1, 55, 25, 7, 10, 0, 45, 5 };
		int bufer = 0;

		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					bufer = array[j];
					array[j] = array[j + 1];
					array[j + 1] = bufer;
				}
			}
		}
		int minOne = array[0];
		int minTwo = array[1];
		int minThree = array[2];

		System.out.println(minOne + " " + minTwo + " " + minThree);
	}

}