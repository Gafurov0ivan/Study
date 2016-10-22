package com.gafur.lessons.week_3.threading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsThreading {
	// its a safe thread collection, but add operation is very long. When add is unusual
	List<Integer> list1 = new CopyOnWriteArrayList();

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> sList = Collections.synchronizedList(list);

		// Safety iterating
		synchronized (sList) {
			for (Integer i : sList) {
				
			}
		}
	}
}
