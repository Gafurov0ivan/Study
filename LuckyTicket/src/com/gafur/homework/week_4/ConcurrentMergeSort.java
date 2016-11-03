package com.gafur.homework.week_4;

public class ConcurrentMergeSort extends Thread {

	private int[] a;
	private int[] tmpArray;
	private int left;
	private int right;

	public ConcurrentMergeSort(int[] a, int[] tmpArray, int left, int right) {
		this.a = a;
		this.tmpArray = tmpArray;
		this.left = left;
		this.right = right;
	}

	public void run() {
		if (this.left < this.right) {
			try {
				int center = (this.left + this.right) / 2;
				ConcurrentMergeSort p = new ConcurrentMergeSort(this.a, this.tmpArray, this.left, center);
				ConcurrentMergeSort q = new ConcurrentMergeSort(this.a, this.tmpArray, center + 1, this.right);
				ConcurrentMerge r = new ConcurrentMerge(this.a, this.tmpArray, this.left, center + 1, this.right);

				// Sort
				p.start();
				q.start();
				p.join();
				q.join();

				// Merge
				r.start();
				r.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public int[] getA() {
		return this.a;
	}
}
