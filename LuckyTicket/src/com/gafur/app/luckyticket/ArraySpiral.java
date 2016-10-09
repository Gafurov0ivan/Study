package com.gafur.app.luckyticket;

public class ArraySpiral {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int c = 0;
		int x = 0;
		int y = 0;

		while (c < 4) {
			while (y < 5) {
				array[x][y] = y;
				y++;
			}
			if (y == 5) {
				x++;
				if (x == 5) {
					break;
				}
				while (y > 0) {
					y--;
					array[x][y] = y;
				}
			}
			c++;
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
