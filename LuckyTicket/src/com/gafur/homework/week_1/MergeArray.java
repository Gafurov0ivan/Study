package com.gafur.homework.week_1;

public class MergeArray {
	public static void main(String[] args) {
		int[] first = { -2, 1, 3, 50 };
		int[] second = { -1, 0, 5, 300 };
		int[] arraySort = mergeSort(first, second);

		for (int item : arraySort)
			System.out.println(item);
	}

	public static int[] mergeSort(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
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