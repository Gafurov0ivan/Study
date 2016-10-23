package com.gafur.homework.week_3.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.gafur.lessons.week_3.annotations.MinLength;

public class Tester {

	public void testAll(String[] classes) {

		try {
			for (String item : classes) {
				Method[] methods = item.getClass().getDeclaredMethods();

				for (Method method : methods) {
					Test test = method.getAnnotation(Test.class);
					if (test != null) {
						boolean answer = test.methodReturn();
						
						method.setAccessible(true);
							Object v = method.get();
							if (v instanceof String) {
								stringValue = (String) v;
							}

							if(stringValue.length() < length){
								return false;
							}
				
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
