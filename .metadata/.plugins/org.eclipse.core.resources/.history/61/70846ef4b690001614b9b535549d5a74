package com.gafur.homework.week_1;

public class ArraySpiral {

	public static void main(String[] args) {
		final int N = 7;
		
		int[][] array = new int[N][N];
		
		int x = 0;
		int y = 0;
		int z = 0;

		while (z < N) {
			while (y < N) {
				array[x][y] = y;
				y++;
			}
			if (y == N) {
				x++;
				if (x == N) {
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
