package com.gafur.homework.week_1;

public class Bags {

	private static int[] a = { 1500, 2, 9, 11, 7, 5, 4, 8, 3, 50 };
	public static int best = Integer.MAX_VALUE;

	public static void main(String[] args) {

		for (int i1 = 0; i1 < a.length; i1++) {
			for (int i2 = 0; i2 < a.length; i2++) {
				for (int i3 = 0; i3 < a.length; i3++) {
					for (int i4 = 0; i4 < a.length; i4++) {
						for (int i5 = 0; i5 < a.length; i5++) {
							for (int i6 = 0; i6 < a.length; i6++) {
								for (int i7 = 0; i7 < a.length; i7++) {
									for (int i8 = 0; i8 < a.length; i8++) {
										for (int i9 = 0; i9 < a.length; i9++) {
											for (int i10 = 1; i10 < a.length; i10++) {
												swap(a[i10 - 1], a[i10]);
												int current = differencePair(a[i1], a[i2], a[i3], a[i4], a[i5], a[i6],
														a[i7], a[i8], a[i9], a[i10]);

												best(current);

											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		System.out.println(best);
	}

	public static int differencePair(int a, int b, int c, int d, int e, int f, int g, int k, int n, int m) {
		int difference = Math.abs((a + b + c + d + e) - (f + g + k + n + m));
		return difference;
	}

	public static void swap(int a, int b) {
		int bufer = a;
		a = b;
		b = bufer;

	}

	public static int best(int current) {

		if (best > current) {
			best = current;
		}
		return best;
	}

}
