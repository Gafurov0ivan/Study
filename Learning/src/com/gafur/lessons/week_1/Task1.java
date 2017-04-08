package com.gafur.lessons.week_1;

/**
 * @author igafurov
 * @since 10.10.2016
 */
public class Task1 {

    public static void main(String[] args) {
        int[][] countTwo = null;
        System.out.println(countTwo);

        // ����� �������������

        // 1 ������
        int[] a = {1, 10, 5, 0, 50};
        int best = a[0];
        for (int i = 0; i < a.length; i++) {
            if (best < a[i]) {
                best = a[i];
            }
        }
        System.out.println(best);

        // 2 ������
        int best1 = 0;
        int current = 0;
        int bestIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] <= a[i]) {
                current++;
            } else {
                current = 0;
            }
            if (current > best1) {
                best1 = current;
                bestIndex = i - best1;
            }
        }
        System.out.println(best);
        for (int i = bestIndex; i < bestIndex + best1 + 1; i++) {
            System.out.println(a[i] + " ");
        }

//	����������� ������
        int[] b = {1, 10, 5, 0, 50};
        for (int i = b.length; i >= 0; i--) {
            for (int j = 0; j < b.length; j++) {

            }
        }
    }
}
