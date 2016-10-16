package com.gafur.lessons.week_2;

import java.util.Collection;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {

		Collection collection = new LinkedList();

		for (int i = 0; i < 100000; i++) {
			collection.add(i);
		}

		System.out.println(collection.isEmpty());

		for (Object e : collection) {
			System.out.println(e);
		}
	}

}
