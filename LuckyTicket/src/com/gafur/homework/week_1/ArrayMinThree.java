package com.gafur.homework.week_1;

public class ArrayMinThree {

	public static void main(String[] args) {
		int[] array = { 1, 55, 25, 7, 10, 0, 45, -1 };

		int minOne = array[0];
		int minTwo = array[1];
		int minThree = array[2];

		for (int i = 3; i < array.length; i++) {
			int bufer = array[i];
			if (minOne >= bufer) {
				if (minTwo > minOne) {
					if (minThree > minTwo) {
						minThree = minTwo;
					}
					minTwo = minOne;
				} else {
					if (minThree > minOne) {
						minThree = minOne;
					}
				}
				minOne = bufer;
			} else {
				if (minTwo >= bufer) {
					if (minThree > minTwo) {
						minThree = minTwo;
					}
					minTwo = bufer;
				}
				else{
					if (minThree >= bufer) {
					minThree = bufer;
				}
				}
			}

		}
		System.out.println(minOne + " " + minTwo + " " + minThree);
	}

}