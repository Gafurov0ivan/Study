package com.gafur.homework.week_1;

public class SnakeInputArray {
	public static void main(String[] args) {
		final int n = 7;
		
		int[][] array = new int[n][n];
		
		int x = 0;
		int y = 0;
		int z = 0;

		while (z < n) {
			while (y < n) {
				array[x][y] = y;
				y++;
			}
			if (y == n) {
				x++;
				if (x == n) {
					break;
				}
				while (y > 0) {
					y--;
					array[x][y] = y;
				}
			}
			z++;
			x++;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("");
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
	}
}
