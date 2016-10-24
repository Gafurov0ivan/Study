package com.gafur.homework.week_3.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tester {

	public void testAll(String[] classes) {
		for (String item : classes) {
			try {
				Class<?> currentClass = Class.forName(item);
				for (Method method : currentClass.getDeclaredMethods()) {
					if (method.isAnnotationPresent(Test.class)) {
						System.out.println(method.invoke(currentClass.newInstance(), 15));
					}
				}
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
