package com.gafur.homework.week_3.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.gafur.lessons.week_3.annotations.MinLength;

<<<<<<< HEAD
public class Tester {

	public void testAll(String[] classes) {

		for (String item : classes) {
			Method[] methods = item.getClass().getDeclaredMethods();

			for (Method method : methods) {
				Test test = method.getAnnotation(Test.class);
				if (test != null) {
					boolean answer = test.methodReturn();
					try {

						method.setAccessible(true);
						Class<?> c = Class.forName(item);
						Object newObject = c.newInstance();
						method.invoke(newObject, 15);

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
		}
	}
}
=======
//public class Tester {
//
//	public void testAll(String[] classes) {
//
//		try {
//			for (String item : classes) {
//				Method[] methods = item.getClass().getDeclaredMethods();
//
//				for (Method method : methods) {
//					Test test = method.getAnnotation(Test.class);
//					if (test != null) {
//						boolean answer = test.methodReturn();
//						
//						method.setAccessible(true);
//							Object v = method.get();
//							if (v instanceof String) {
//								stringValue = (String) v;
//							}
//
//							if(stringValue.length() < length){
//								return false;
//							}
//				
//			}
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		}
//	}
//}
>>>>>>> 7b7f29bd88126097008c560215d786d88c95664c
