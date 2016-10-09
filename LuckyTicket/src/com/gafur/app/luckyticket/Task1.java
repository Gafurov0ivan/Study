package com.gafur.app.luckyticket;

public class Task1 {

	public static void main(String[] args) {
		// int[] count = {1,2,10,4,28,13,23,48};

		int[][] countTwo = null;


		// while (x <25){
		// x++;
		// while->
		// while down
		// while <-
		// while up

		// while (x <25){
		// x++;
		// while(y<5){
		// y++;
		//
		// while(z<5){
		// z++;
		//
		// while(m<5){
		// m++;
		//
		// while(q<5){
		// q++;
		// countTwo[y][z] = q;
		// }
		// }
		// }
		// }
		//
		//
		// }

		System.out.println(countTwo);

		// Поиск максимального

		// 1 способ

		int[] a = { 1, 10, 5, 0, 50 };

		int best = a[0];
		for (int i = 0; i < a.length; i++) {
			if (best < a[i]) {
				best = a[i];
			}
		}
		System.out.println(best);

		// 2 способ

		int best1 = 0;
		int current = 0;
		int bestIndex = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] <= a[i]) {
				current++;
			} else {
				current = 0;
			}
			if (current > best1) {
				best1 = current;
				bestIndex = i - best1;
			}
		}
		System.out.println(best);
		for (int i = bestIndex; i < bestIndex + best1 + 1; i++) {
			System.out.println(a[i] + " ");
		}


	
//	Перевернуть массив
	
	int[] b = { 1, 10, 5, 0, 50 };


	for(int i=b.length; i>=0; i--){
		for(int j=0; j<b.length; j++){
			
		}
	}
	
	
		
}
}
