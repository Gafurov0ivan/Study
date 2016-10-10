package com.gafur.lessons.week_1;

public class Task4 {

	public static void main(String[] args) {

		// Сравнение вещ чисел
		double d1 = 1.3425434545345d;
		double d2 = 1.3534565645656d;
		// на равно
		if (Math.abs(d1 - d2) <= 1e-8) {
		}
		// на больше, меньше
		if (d1 - d2 > 1e-8) {
		}
	}
//	Рекурсия
	public int rec(int i){
		if(i==0){
			return 1;
		}
		return rec(i-1)*i;
	}

}
