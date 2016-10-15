package com.gafur.homework.week_2;

public class ChessHorse {
	static int count = 0;
	static int n = 5;
	static int m = 5;

	public static int[][] horseMove(int x, int y, int n, int[][] array) {
		if (count == n) {
			return array;
		}
		for (int i = x; i < n - 1; i++) {
			for (int j = y; j < m - 1; j += 2) {
				array[i][j] = 1;
				count++;
				horseMove(j,i, n, array);
				array[i][j] = 0;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		array  = horseMove(0,0,n, array);

		for(int i = 0; i<array.length; i++){
			System.out.println(" ");
			for(int j = 0; j<array.length; j++){
				System.out.print(array[i][j] + " ");
			}
		}
		
	}

}
