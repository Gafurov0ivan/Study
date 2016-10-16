package com.gafur.lessons.week_2;

public class Exceptions {
	public static double m(int a) throws MyException, MyException2 {
		return a;

	}

	public static void main(String[] args) {
		
//		открываем соединение

		try {
			m(10);
//			закрываем соединение
		} catch (MyException | MyException2 e) {
			e.printStackTrace();
		} finally {
//			закрываем соединение
		}
		}
	}

