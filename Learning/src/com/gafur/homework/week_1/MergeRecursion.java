package com.gafur.homework.week_1;

/**
 * Merge sort 2 arrays with recursion
 *
 * @author igafurov
 * @since 10.10.2016
 */
public class MergeRecursion {

    public static void main(String[] args) {
        int[] array = {4, 7, 5, 1, 0, 1, 35, 0};
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
        mergeSort(newArrayOne);

        for (int j = array.length / 2, i = 0; i < newArrayTwo.length; j++, i++) {
            newArrayTwo[i] = array[j];
        }
        mergeSort(newArrayTwo);
        array = sort(array, newArrayOne, newArrayTwo);
        return array;
    }

    public static int[] sort(int[] result, int[] first, int[] second) {
        result = new int[first.length + second.length];
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
