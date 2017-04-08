package com.gafur.homework.week_1;

/**
 * Merge sort 2 arrays
 *
 * @author igafurov
 * @since 10.10.2016
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] first = {-2, 1, 3, 50};
        int[] second = {-1, 0, 5, 300};
        int[] arraySort = mergeSort(first, second);

        for (int item : arraySort)
            System.out.println(item);
    }

    public static int[] mergeSort(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = first[firstIndex] < second[secondIndex] ? first[firstIndex++] : second[secondIndex++];
            if (firstIndex == first.length) {
                while (secondIndex < second.length) {
                    result[++i] = second[secondIndex++];
                }
            } else {
                if (secondIndex == second.length) {
                    while (firstIndex < first.length) {
                        result[++i] = first[firstIndex++];
                    }
                }
            }
        }
        return result;
    }
}