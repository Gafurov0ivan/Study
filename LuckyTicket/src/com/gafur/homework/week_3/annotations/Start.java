package com.gafur.homework.week_3.annotations;

public class Start {

	public static void main(String[] args) {
		String[] classes = { 
				"com.gafur.homework.week_3.annotations.Alpha",
				"com.gafur.homework.week_3.annotations.Beta", 
				"com.gafur.homework.week_3.annotations.Gamma" };

		Tester tester = new Tester();
		tester.testAll(classes);
	}
}