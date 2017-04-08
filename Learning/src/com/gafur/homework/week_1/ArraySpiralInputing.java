package com.gafur.homework.week_1;

/**
 * Input array with spiral
 *
 * @author igafurov
 * @since 05.10.2016
 */
public class ArraySpiralInputing {
    final static int n = 5;

    public static void main(String[] args) {
        int[][] array = new int[n][n];
        int[][] newArray = arrayInputSpiral(n, array);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("");
            for (int j = 0; j < newArray.length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
        }
    }

    public static int[][] arrayInputSpiral(int n, int[][] array) {

        int z = 1;
        int x = 0;
        int countX = n - 1;
        int y = 0;
        int countY = n - 1;

        while (z <= n * n) {

            for (int i = x; i <= countX; i++) {
                array[y][i] = z++;
            }
            for (int i = y + 1; i <= countY; i++) {
                array[i][countX] = z++;
            }
            for (int i = countX - 1; i >= x; i--) {
                array[countY][i] = z++;
            }
            for (int i = countY - 1; i >= y + 1; i--) {
                array[i][x] = z++;
            }
            x++;
            countX--;
            y++;
            countY--;
        }
        return array;
    }
}
