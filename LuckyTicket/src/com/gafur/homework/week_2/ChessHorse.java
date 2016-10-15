package com.gafur.homework.week_2;

public class ChessHorse {
	static int count = 0;
	static int N = 5;
	static int M = 5;

	public static int[][] horseMove(int x, int y, int n, int[][] array) {
		if (n == count) {
			return array;
		}
		for (int i = x; i < N - 1; i++) {
			for (int j = y; j < M - 1; j += 2) {
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
		
		array  = horseMove(0,0,5, array);

		for(int i = 0; i<array.length; i++){
			System.out.println(" ");
			for(int j = 0; j<array.length; j++){
				System.out.print(array[i][j] + " ");
			}
		}
		
	}

}
