package com.gafur.homework.week_3.annotations;

public class Alpha {

	@Test
	public boolean diapason(int item) {
		if (item >= 8 && item <= 13) {
			return true;
		}
		return false;
	}
}
