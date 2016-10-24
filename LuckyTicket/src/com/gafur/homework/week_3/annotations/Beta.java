package com.gafur.homework.week_3.annotations;

public class Beta {
	
	@Test
	public boolean diapason(int item) {
		if (item > 13 && item <= 40) {
			return true;
		}
		return false;
	}
}
