package com.gafur.homework.week_3.annotations;

public class Gamma {

	@Test
	public boolean diapason(int item) {
		if (item > 30 && item <= 100) {
			return true;
		}
		return false;
	}
}