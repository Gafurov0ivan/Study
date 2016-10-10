package com.gafur.homework.week_1;

public class Bags {

	private static int[] a = { 3, 2, 9, 11, 7, 5, 4, 8, 3, 50 };
	public static int best = differencePair(a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8], a[9]);

	public static void main(String[] args) {

		int current = differencePair(a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8], a[9]);
		best(current);
		System.out.println(best);
	}

	public static int differencePair(int a, int b, int c, int d, int e, int f, int g, int k, int n, int m) {
		int difference = 0;

		for (int i1 = 0; i1 < 10; i1++) {
			for (int i2 = 0; i2 < 10; i2++) {
				for (int i3 = 0; i3 < 10; i3++) {
					for (int i4 = 0; i4 < 10; i4++) {
						for (int i5 = 0; i5 < 10; i5++) {
							for (int i6 = 0; i6 < 10; i6++) {
								for (int i7 = 0; i7 < 10; i7++) {
									for (int i8 = 0; i8 < 10; i8++) {
										for (int i9 = 0; i9 < 10; i9++) {
											for (int i10 = 0; i10 < 10; i10++) {

												difference = (a + b + c + d + e) - (f + g + k + n + m);

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

		return difference;
	}

	public static int best(int current) {

		if (best < 0) {
			best = 0;
		}
		if (best > current) {
			best = current;
		}
		return best;
	}

}
