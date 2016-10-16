package com.gafur.lessons.week_2;

public class TestMyArrayList {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();

		for (int i = 0; i < 100; i++) {
			list.add(i);
		}

		list.remove(0);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
	}
}
