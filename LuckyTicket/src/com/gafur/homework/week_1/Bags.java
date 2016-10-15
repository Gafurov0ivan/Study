package com.gafur.homework.week_1;

//public class Bags {
//
//	public static int best = Integer.MAX_VALUE;
//
//	public static void main(String[] args) {
//		int[] array = { 10, 2, 9, 11, 7, 5, 4, 8, 3, 50 };
//
//		
//		System.out.println(best);
//
//	}
//
//	public static void showPermutations(int sum1, int sum2, int i, int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length - 1; j++) {
//				int current = differencePair(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8],
//						array[9]);
//				System.out.println(current);
//				best(current);
//				int tmp = array[j];
//				array[j] = array[j + 1];
//				array[j + 1] = tmp;
//			}
//		}
//		
//	}
//
//	public static int differencePair(int a, int b, int c, int d, int e, int f, int g, int k, int n, int m) {
//		int difference = Math.abs((a + b + c + d + e) - (f + g + k + n + m));
//		return difference;
//	}
//
//	public static void best(int[] array) {
//		
//		showPermutations(0,0,0, array);
//		if (best > current) {
//			best = current;
//		}
//	}
//
//	public static void swap(int a, int b) {
//		int bufer = a;
//		a = b;
//		b = bufer;
//	}
//}
