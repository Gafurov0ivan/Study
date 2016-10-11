package com.gafur.homework.week_1;

public class Recursion {
	// Decision of task with bags

	public static int best = Integer.MAX_VALUE;

	public static void rec(int sum1, int sum2, int i, int[] a) {
		// it's only check
		if (i == a.length) {
			if (best > Math.abs(sum2 - sum1)) {
				best = Math.abs(sum2 - sum1);
			}
			return;
		}
		rec(sum1 + a[i], sum2, i + 1, a);
		rec(sum1, sum2 + a[i], i + 1, a);
	}

	public static int calc(int[] a) {
		best = Integer.MAX_VALUE;
		rec(0, 0, 0, a);
		return best;
	}

	public static void main(String[] args) {
		int a[] = { 1500, 2, 9, 11, 7, 5, 4, 8, 3, 50 };
		System.out.println(calc(a));
	}

}
