package com.gafur.homework.week_2;

/**
 * Find fibonachi numbers of interval
 *
 * @author igafurov
 * @since 15.10.2016
 */
public class Fibonachi {
    private static int N = 6;
    private static int count = 0;
    private static int c = 0;
    private static int a = 1;
    private static int b = 1;

    public static void main(String[] args) {
        System.out.println(findFibonachi(a, b, N));
    }

    public static int findFibonachi(int a, int b, int n) {
        if (n - 2 == count) {
            return c;
        }
        c = a + b;
        count++;
        findFibonachi(b, c, n);
        return c;
    }
}
