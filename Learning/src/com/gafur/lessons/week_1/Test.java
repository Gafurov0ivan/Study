package com.gafur.lessons.week_1;

/**
 * @author igafurov
 * @since 10.10.2016
 */
public class Test {
    public static void main(String[] args) {
        int[] values = {1500, 2, 9, 11, 7, 5, 4, 8, 3, 50};
        int n = values.length;
        int r = 10;
        int i[] = new int[r];
        int rc = 0;

        for (int j = 0; j < Math.pow(n, r); j++) {
            rc = 0;
            while (rc < r) {
                System.out.print(values[i[rc]] + " ");
                rc++;
            }
            System.out.println();
            rc = 0;
            while (rc < r) {
                if (i[rc] < n - 1) {
                    i[rc]++;
                    break;
                } else {
                    i[rc] = 0;
                }
                rc++;
            }
        }
    }
}