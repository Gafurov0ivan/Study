package com.gafur.homework.week_1;

public class MergeArray {

	public static void main(String[] args) {
		int[] firstArray = { 0, 3, 4, 7, 10, 11, 20 };
		int[] secondArray = { -5, -1, 10, 31, 55, 73, 357, 457 };

		int[] thirdArray = new int[firstArray.length + secondArray.length];
		int bufer = firstArray[0];
		int count = 0;

		for (int i = 0; i < secondArray.length; i++) {
			for (int j = 0; j < firstArray.length; j++) {
				if (secondArray[i] <= firstArray[j]) {
					bufer = secondArray[i];
				} else {
					bufer = firstArray[j];
				}

				thirdArray[count] = bufer;
				while(count<thirdArray.length-1){
					count++;
				}
				
			}
		}

		for (int out : thirdArray) {
			System.out.println(out);
		}
	}
}
