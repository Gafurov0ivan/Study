package com.gafur.homework.week_4;

import java.util.Random;

public class Start {

	public static void main(String[] args) {
		int[] array = new int[1_000];
		Random randomGenerator = new Random();
		for (int i = 0; i < array.length; i++) {
			int item = randomGenerator.nextInt(10);
			array[i] = item;
		}
		
		for (int value : array) {
			System.out.print(value + " ");
		}

//		MergeMultiThread.NewThread sort = new MergeMultiThread.NewThread(array, 0, array.length - 1);
//		Thread thread = new Thread(sort);
//		thread.start();

		for (int value : array) {
			System.out.println(value);
		}
	}
}
