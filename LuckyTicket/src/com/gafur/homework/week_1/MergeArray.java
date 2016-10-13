package com.gafur.homework.week_1;

public class MergeArray {
	public static void main(String[] args) {
		int[] first = { 4, 7, 5, 1 };
		int[] second = { 0, 1, 35, 0 };
		int[] arraySort = mergeSort(first, second);

		for (int item : arraySort)
			System.out.println(item);
	}

	public static int[] mergeSort(int[] first, int[] second) {
		int[] third = new int[first.length + second.length];
		
			for (int n = 0, m = 0, i = 0; n < first.length && m < second.length && i < third.length;) {
				if (first[n] < second[m]) {
					third[i] = first[n];
					n++;
					i++;
				} else {
					if (first[n] >= second[m]) {
						if (first[n] > second[m])
							third[i] = second[m];
						m++;
						i++;
					}
					else{if (first[n] == second[m]) {
							third[i] = first[n];
							n++;
							i++;
							third[i] = second[m];
							m++;
							i++;
						}
					}
				}
			}
		
		return third;
	}
}

// if (firstCapacity < first.length && secondCapacity < second.length) {
// if (first[firstCapacity] <= second[secondCapacity]) {
// third[i] = first[firstCapacity];
// firstCapacity++;
// }
//
// else {
// third[i] = second[secondCapacity];
// secondCapacity++;
// }
// } else {
// if (firstCapacity == first.length && secondCapacity < second.length) {
// third[i] = second[secondCapacity];
// secondCapacity++;
// }
// if (secondCapacity == second.length && firstCapacity < first.length) {
// third[i] = first[firstCapacity];
// firstCapacity++;
// }
// }
