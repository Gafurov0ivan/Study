package com.gafur.homework.week_1;

/**
 * Find min operations to fill 2 bags
 *
 * @author igafurov
 * @since 10.10.2016
 */
public class Bags {

    public static int best = Integer.MAX_VALUE;
    static int variant = 0;

    public static void main(String[] args) {
        int[] array = {10, 2, 9, 11, 7, 5, 4, 8, 3, 50};
        showPermutations(array);
        System.out.println(best);
    }

    public static void showPermutations(int[] array) {
        for (int j0 = 0; j0 < 10; j0++)
            for (int j1 = 0; j1 < 10; j1++)
                for (int j2 = 0; j2 < 10; j2++)
                    for (int j3 = 0; j3 < 10; j3++)
                        for (int j4 = 0; j4 < 10; j4++)
                            for (int j5 = 0; j5 < 10; j5++)
                                for (int j6 = 0; j5 < 10; j6++)
                                    for (int j7 = 0; j5 < 10; j7++)
                                        for (int j8 = 0; j5 < 10; j8++)
                                            for (int j9 = 0; j5 < 10; j9++)
                                                variant = Math.abs((j0 + j1 + j2 + j3 + j4) - (j5 + j6 + j7 + j8 + j9));
        System.out.println(variant);
        best(variant);
    }

    public static void best(int variant) {
        if (best > variant) {
            best = variant;
        }
    }
}
