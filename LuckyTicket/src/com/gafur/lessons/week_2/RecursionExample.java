package com.gafur.lessons.week_2;

public class RecursionExample {
//	Сколько можно положить плиток на 2n 
	
//	1 0 0 0 0 0   - либо так 
//	1 0 0 0 0 0
//	
//	0 0 0 0 0 0   - либо так
//	0 0 1 1 0 0 
//  Нужно выбрать или так или так
	
	// полоска 2*n - это состояние
//	кладем плитку - изменяем состояние

	public static int N = 6;
	static int count = 0;
	static int[][] a = new int[N][2];

	public static void rec(int n, int i0, int j0) {
		if (n == N) {
			count++;
			return;
		}
//		кладем плитку(горизонтально)
		for(int i = 0; i<N; i++){
			if(a[i][0] == 0 && a[i][1] == 0){
				a[i][0] = 1;
				a[i][1] = 1;
				rec(n+1, i0 +1, j0);
//				убираем плитку
				a[i][0] = 0;
				a[i][1] = 0;
			}
		}
//		кладем плитку(вертикально)
		for(int i = j0; i<N-1; i++){
			for(int j = 0; j<2; j++){
			if(a[i][j] == 0 && a[i+1][1] == 0){
				a[i][j] = 1;
				a[i+1][j] = 1;
				rec(n+1, i0, j0+j);
//				убираем плитку
				a[i][j] = 0;
				a[i+1][j] = 0;
			}
		}
		}
		

	}

	public static void main(String[] args) {
		rec(0,0,0);

	}

}
