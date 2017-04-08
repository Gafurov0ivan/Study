package com.gafur.lessons.week_2;

/**
 * @author igafurov
 * @since 15.10.2016
 */
public class RecursionExample {

//	1 0 0 0 0 0   
//	1 0 0 0 0 0
//	
//	0 0 0 0 0 0   
//	0 0 1 1 0 0 

    public static int N = 6;
    static int count = 0;
    static int[][] a = new int[N][2];

    public static void rec(int n, int i0, int j0) {
        if (n == N) {
            count++;
            return;
        }
        for (int i = 0; i < N; i++) {
            if (a[i][0] == 0 && a[i][1] == 0) {
                a[i][0] = 1;
                a[i][1] = 1;
                rec(n + 1, i0 + 1, j0);
                a[i][0] = 0;
                a[i][1] = 0;
            }
        }
        for (int i = j0; i < N - 1; i++) {
            for (int j = 0; j < 2; j++) {
                if (a[i][j] == 0 && a[i + 1][1] == 0) {
                    a[i][j] = 1;
                    a[i + 1][j] = 1;
                    rec(n + 1, i0, j0 + j);
                    a[i][j] = 0;
                    a[i + 1][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        rec(0, 0, 0);
        System.out.println(count);
        m(myEnum.JANUARY);
    }

    private static void m(myEnum a) {
    }
}
