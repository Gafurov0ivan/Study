package com.gafur.homework.week_1;

public class MergeRecursion {
	private static int[] newArrayOne = null;
	private static int[] newArrayTwo = null;

	public static void main(String[] args) {
		int[] array = { 4, 7, 5, 1, 0, 1, 35, 0 };

		int[] sortArray = mergeSort(array, array.length);
		for (int item : sortArray) {
			System.out.println(item);
		}

	}

	public static int[] mergeSort(int[] array, int newLength) {
		newArrayOne = new int[array.length / 2];
		newArrayTwo = new int[array.length / 2];
		for (int i = 0; i < newArrayOne.length; i++) {
			newArrayOne[i] = array[i];
		}
		for (int j = array.length / 2, i = 0; i < newArrayTwo.length; j++, i++) {
			newArrayTwo[i] = array[j];
		}
		array = sort(newArrayOne, newArrayTwo);

		if (newLength >= 1) {
			
			mergeSort(newArrayOne, newArrayOne.length / 2);
			
			mergeSort(newArrayTwo, newArrayTwo.length / 2);

			

		}

		return array;

	}

	public static int[] sort(int[] arrayFirst, int[] arraySecond) {
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
