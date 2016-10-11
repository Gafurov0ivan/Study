package com.gafur.homework.week_1;

public class Bags {

	private static int[] a = { 10, 2, 9, 11, 7, 5, 4, 8, 3, 50 };
	public static int best = differencePair(a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8], a[9]);

	public static void main(String[] args) {

		for (int i1 = 0; i1 < a.length; i1++) {
			for (int i2 = i1+1; i2 < a.length; i2++) {
				for (int i3 = i2+1; i3 < a.length; i3++) {
					for (int i4 = i3+1; i4 < a.length; i4++) {
						for (int i5 = i4+1; i5 < a.length; i5++) {
							for (int i6 = i5+1; i6 < a.length; i6++) {
								for (int i7 = i6+1; i7 < a.length; i7++) {
									for (int i8 = i7+1; i8 < a.length; i8++) {
										for (int i9 = i8+1; i9 < a.length; i9++) {
											for (int i10 = i9+1; i10 < a.length; i10++) {
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

	public static int best(int current) {

		if (best >= current) {
			best = current;
		}
		return best;
	}

}
