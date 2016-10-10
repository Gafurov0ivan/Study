package com.gafur.lessons.week_1;

public class LuckyTeacher {

	public static void main(String[] args) {
		int count = 0;
		
		for( int j0 = 0; j0 < 10; j0++)
			for( int j1 = 0; j1 < 10; j1++)
				for( int j2 = 0; j2 < 10; j2++)
					for( int j3 = 0; j3 < 10; j3++)
						for( int j4 = 0; j4 < 10; j4++)
							for( int j5 = 0; j5 < 10; j5++)
								if(j0 + j1 + j2 == j3 + j4 + j5){
									count++;
								}
		System.out.println(count);
		// 1-ый Избавились от разбивания числа на цифры
		// 2-ой считаем все варианты получения каждой суммы в одной стороне и
		// возводим в квадрат(сколько способов получить 1, 2 и т.д.)
		// 3 -ий Динамаическое программирование
        // Через массив
//		int[] count1 = new int[28];
//
//		for (int j0 = 0; j0 < 10; j0++)
//			for (int j1 = 0; j1 < 10; j0++)
//				for (int j2 = 0; j2 < 10; j0++)
//
//					count1 [j0 + j1 + j2]++;
//	
//	int sum = 0;
//	for(int i = 0; i < count1.length; i++){
//		sum = sum + count1[i] * count1[i];
//	}
//	System.out.println(sum);
}
}



