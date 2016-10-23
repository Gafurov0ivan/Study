package com.gafur.homework.week_3.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Tester {
	private static final Object item = null;

	public boolean testAll(String[] classes) {
		
		for(String item : classes){
			Method[] methods = item.getClass().getDeclaredMethods();
//			Object object = new getClass(item);
			
			
			for(Method value : methods){
//				value.invoke(obj, 15);
			}
			
		}
		return false;
	}
}
