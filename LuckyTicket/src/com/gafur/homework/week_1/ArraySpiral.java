package com.gafur.homework.week_1;

public class ArraySpiral {
	int x = 0;
	int y = 0;
	int z = 0;

	public static void main(String[] args) {

		final int n = 3;

		int[][] array = new int[n][n];
		arrayInputSpiral(3,3,array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("");
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}


	}

	public static void arrayInputSpiral(int x, int y, int[][] array){
		
		
//		for(int a = 0; a<x; a++){
//			for(int b = a; b<y; b++){
//				for(int c = b; c>=0; c--){
//					for(int d = c; d>=0;d--){
//						array[c][d] = 5;
//					}
//				}
//			}
//		}
		
		int a = 0,b = 0,c = 0,d = 0;
		
		while(a>=0){
			
		while(b>=0){
			
		while(a<y){
			
		while(b<x){
			array[a][b] = b;
			b++;
		}
		a++;
		}
		b--;
		}
		a--;
		}
		
		
		
		
//		for(d = c; d>=0; d--){
//		for(c = b; c>=0; c--){
//		for(a = 0; a<y; a++){
//			array[a][b] = b;
//		for(b = 0; b<x; b++){
//			array[a][b] = b;
//		}
//		}
//		}
//		}
		
		

//		if(x!=3 && y!=3){	
//		arrayInputSpiral(x+1, y, array);
//		arrayInputSpiral(x, y+1, array);
//		arrayInputSpiral(x-1, y, array);
//		arrayInputSpiral(x, y-1, array);
//		}
		
	}

}
