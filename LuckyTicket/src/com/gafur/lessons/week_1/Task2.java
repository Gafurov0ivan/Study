package com.gafur.lessons.week_1;

public class Task2 {

	public static void main(String[] args) {
		int[] b = { 1, 10, 5, 0, 50 };
		int bufer = 0;
		int saveElement = 0;

		for (int i = b.length - 1; i >= 0; i--) {
			for (int j = 0; j < b.length; j++) {
				bufer = b[i];
				saveElement = b[j];
				b[i] = saveElement;
				b[j] = bufer;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}

		for (int i = 0; i < b.length / 2; i++) {
			int p = b[i];
			b[i] = b[b.length - i - 1];
			b[b.length - i - 1] = p;
		}

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
