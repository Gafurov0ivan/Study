package com.gafur.homework.week_1;

/**
 * All variants arrangement of queens and they do not intersect
 *
 * @author igafurov
 * @since 10.10.2016
 */
public class Queen {
    private static int N = 8;
    private static int count = 0;
    private static int[][] chessTable = new int[N][N];

    public static void moveQueen(int x, int y, int n) {
        if (n == N) {
            return;
        }
        for (int i = x; i < N - 1; i++) {
            for (int j = y; j < N - 1; j++) {
                if (chessTable[i][j] == 0) {
                    for (int z = i; z < N; z++) {
                        chessTable[z][j] = 1;
                    }
                    for (int z = j; z < N; z++) {
                        chessTable[i][z] = 1;
                    }
                    for (int z = i, q = i; z < N && q < N; z++, q++) {
                        chessTable[z][q] = 1;
                    }
                    moveQueen(n + 1, x + 1, y + 2);
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        moveQueen(0, 0, 0);
        System.out.println(count);
    }
}
