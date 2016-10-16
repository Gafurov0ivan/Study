package com.gafur.lessons.week_2;

public class Generics {

	public static <T> T sum(T a, T b) {
		return null;
	}

	// public static Long sum(Long a, Long b) {
	// return 0l;
	// }

	public static void main(String[] args) {
		sum(0, 0);
		Integer a = sum(0, 0);
		Long b = sum(0l, 0l);

	}

}
