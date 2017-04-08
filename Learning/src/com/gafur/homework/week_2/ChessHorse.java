package com.gafur.homework.week_2;

/**
 * Method of bypassing by horse a chessboard
 *
 * @author igafurov
 * @since 15.10.2016
 */
public class ChessHorse {
    private static int N = 6;
    private static int count = 0;
    private static int bufer = 0;
    private static int[][] chessTable = new int[5][5];

    public static void horseMove(int n, int x, int y) {
        if (n == N) {
            return;
        }
        for (int i = x; i < N - 1; i += 2) {
            for (int j = y; j < N - 1; j++) {
                if (chessTable[i][j] == 0) {
                    chessTable[i][j] = 1;
                    System.out.println("i = " + i + " j = " + j);

                    horseMove(n + 1, j + 1, i + 2);
                    bufer = x;
                    x = y;
                    y = bufer;

                    System.out.println(count);
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {

        horseMove(0, 0, 0);
        System.out.println(count);
        for (int i = 0; i < chessTable.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < chessTable.length; j++) {
                System.out.print(chessTable[i][j] + " ");
            }
        }
    }
}
