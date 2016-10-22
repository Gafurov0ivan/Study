package com.gafur.lessons.week_3.threading;

public class ThreadLocalExample {

	static ThreadLocal<String> myThreadLocal = new ThreadLocal<>();

	// прокинули объект дальше

	public static void m1() {
		String someValue = "Hello";
		myThreadLocal.set(someValue);
		m2();
	}

	public static void m2() {

		myThreadLocal.set(myThreadLocal.get());
	}

	public static void main(String[] args) {
		ThreadLocalExample t = new ThreadLocalExample();
		try {
			t.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
