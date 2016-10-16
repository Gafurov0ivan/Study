package com.gafur.homework.week_1;

public class MergeRecursion {

	public static void main(String[] args) {
		int[] array = { 4, 7, 5, 1, 0, 1, 35, 0 };
		int[] sortArray = mergeSort(array);
		for (int item : sortArray) {
			System.out.println(item);
		}
	}

	public static int[] mergeSort(int[] array) {

		if (array.length <= 1) {
			return array;
		}

			int[] newArrayOne = new int[array.length / 2];
			int[] newArrayTwo = new int[array.length / 2];

			for (int i = 0; i < newArrayOne.length; i++) {
				newArrayOne[i] = array[i];
			}
			
			for (int j = array.length / 2, i = 0; i < newArrayTwo.length; j++, i++) {
				newArrayTwo[i] = array[j];
			}
			mergeSort(newArrayOne);
			mergeSort(newArrayTwo);
			array = sort(array, newArrayOne, newArrayTwo);
		
		return array;
	}

	public static int[] sort(int[] result, int[] a, int[] b) {
		result = new int[a.length + b.length];
		int aIndex = 0;
		int bIndex = 0;

		for (int i = 0; i < result.length; i++) {
			result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
			if (aIndex == a.length) {
				while (bIndex < b.length) {
					result[++i] = b[bIndex++];
				}
			} else {
				if (bIndex == b.length) {
					while (aIndex < a.length) {
						result[++i] = a[aIndex++];
					}
				}
			}
		}
		return result;
	}
}
