package com.gafur.homework.week_2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		MyArrayList<Integer> list1 = new MyArrayList<>();
		list1.add(null);
		list1.add(-212323);
		list1.add(212323);
		
<<<<<<< HEAD


=======
		Object[] arr = new Object[0];
>>>>>>> origin/master
		
		arr = list1.toArray(arr);
		
<<<<<<< HEAD
			System.out.println(list1.get(0));
=======
		for(Object value : arr){
			System.out.println(value);
		}
>>>>>>> origin/master

	}
}
