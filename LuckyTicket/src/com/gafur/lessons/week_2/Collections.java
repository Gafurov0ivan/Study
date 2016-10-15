package com.gafur.lessons.week_2;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		
		for(int i = 0; i < 100000; i++){
			collection.add(i);
		}
		
		System.out.println(collection.isEmpty());

	}

}
