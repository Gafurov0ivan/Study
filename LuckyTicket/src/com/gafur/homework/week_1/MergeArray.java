package com.gafur.homework.week_1;

public class MergeArray {

	private static int x;


	public static void main(String[] args) {
		int[] arrayfirst = { 0, 3, 4, 7, 10, 11, 20 };
		int[] arraySecond = { -5, -1, 10, 31, 55, 73, 357, 457 };
		
		int[] arraySort = mergeSort(0,0, arrayfirst, arraySecond);
		
		for(int item : arraySort)
		System.out.println(item);
	}


//			for (int j = 0, i = 0; j < firstArray.length; j++, i++) {
//				if(i == secondArray.length){
//					break;
//				}
//				if (secondArray[i] <= firstArray[j]) {
//					bufer = secondArray[i];
//				} else {
//					bufer = firstArray[j];
//				}
//				
//				}
//				
//			}
//		
//
//		for (int out : thirdArray) {
//			System.out.println(out);
//		}
//	}
	
	public static int[] mergeSort(int i, int j, int[] arrayfirst, int[] arraySecond){
		int[] thirdArray = new int[arrayfirst.length + arraySecond.length];
		if(arrayfirst[i] <= arraySecond[j]){
			if(x<thirdArray.length){
				thirdArray[x] = arrayfirst[i];
				x++;
		}
			i++;

		}
		else{
			if(x<thirdArray.length){
				thirdArray[x] = arraySecond[j];
				x++;
		}
			mergeSort(i+1, j+1, arrayfirst, arraySecond);
		}
		return thirdArray;
	}
}

