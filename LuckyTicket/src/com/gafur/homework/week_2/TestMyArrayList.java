package com.gafur.homework.week_2;

import java.util.ArrayList;

public class TestMyArrayList {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();

		for (int i = 0; i < 100; i++) {
			list.add(i);
		}

		list.trimToSize();
		list.remove(1);
		list.remove(0);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(" ");
		System.out.println(list.size());

	}
}
