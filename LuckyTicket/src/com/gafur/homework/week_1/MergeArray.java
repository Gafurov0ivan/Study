package com.gafur.homework.week_1;

public class MergeArray {
	public static void main(String[] args) {
		int[] arrayfirst = { 4, 7, 5, 1};
		int[] arraySecond = { 0, 1, 35, 0 };
		int[] arraySort = mergeSort(arrayfirst, arraySecond);

		for (int item : arraySort)
			System.out.println(item);
	}

	public static int[] mergeSort(int[] arrayFirst, int[] arraySecond) {
		int[] thirdArray = new int[arrayFirst.length + arraySecond.length];
		int firstCapacity = 0;
		int secondCapacity = 0;
		for (int i = 0; i < thirdArray.length; i++) {
			if (firstCapacity < arrayFirst.length && secondCapacity < arraySecond.length) {
				if (arrayFirst[firstCapacity] <= arraySecond[secondCapacity]) {
					thirdArray[i] = arrayFirst[firstCapacity];
					firstCapacity++;
				}

				else {
					thirdArray[i] = arraySecond[secondCapacity];
					secondCapacity++;
				}
			} else {
				if (firstCapacity == arrayFirst.length && secondCapacity < arraySecond.length) {
					thirdArray[i] = arraySecond[secondCapacity];
					secondCapacity++;
				}
				if (secondCapacity == arraySecond.length && firstCapacity < arrayFirst.length) {
					thirdArray[i] = arrayFirst[firstCapacity];
					firstCapacity++;
				}
			}

		}
		return thirdArray;
	}
}
