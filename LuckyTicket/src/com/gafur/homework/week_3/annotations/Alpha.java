package com.gafur.homework.week_3.annotations;

public class Alpha {

	@Test
	public boolean diapason(int item) {
		if (item >= 8 && item <= 14) {
			return true;
		}
		return false;
	}
}
