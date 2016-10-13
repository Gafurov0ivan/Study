package com.gafur.homework.week_1;

public class Bags {
 
	public static int best = Integer.MAX_VALUE;

	public static void main(String[] args) {
		int[] array = { 1500, 2, 9, 11, 7, 5, 4, 8, 3, 50 };
		int count = 1;
		int capacity = array.length;
		
		while(true){
			for (int i=0; i < capacity; i++)
				System.out.printf("%d" , array [i]);
			System.out.println("\n");
	 
			for (int j = capacity - 2 ; j >= 0 && array [j+1] < array [j]; j--){
			int k = j;
			if (k == -1) break;
			
	 
			for (j = capacity - 1 ; j >= 0 && array [j] < array[k]; j--){
			int k2 = j;
			swap ( array [k] , array [k2]);
			}
	 
//			reverse (&array [k+1] , &array [capacity]);
			count++;
			}
	 
		}

//		int current = differencePair(a[i1], a[i2], a[i3], a[i4], a[i5], a[i6], a[i7], a[i8], a[i9], a[i10]);

//		best(current);

//		System.out.println(best);
	}



	public static int differencePair(int a, int b, int c, int d, int e, int f, int g, int k, int n, int m) {
		int difference = Math.abs((a + b + c + d + e) - (f + g + k + n + m));
		return difference;
	}

	public static int best(int current) {

		if (best > current) {
			best = current;
		}
		return best;
	}
	public static void swap(int a, int b) {
		int bufer = a;
		a = b;
		b = bufer;

	}
	private static void reverse(int i, int j) {
		
		
	}

}
