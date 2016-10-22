package com.gafur.lessons.week_3.threading;

public class Start1 {

	public static int count = 0;
	public static final Object flag = new Object();

	public static class MyRunnable implements Runnable {

		@Override
		public void run() {
//			this - Start1.class(if method is static), may enter anything, but must be an object
//			synchronized (this) {
			synchronized (flag) {
				for (int i = 0; i < 100_000; i++) {
					count++;
				}
			}
		}
	}

	public static void main(String[] args) {

		Thread[] threads = new Thread[8];
		for (int i = 0; i < 8; i++) {
			Thread thread = new Thread(new MyRunnable());
			threads[i] = thread;
			thread.start();
		}
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(count);
	}
}
