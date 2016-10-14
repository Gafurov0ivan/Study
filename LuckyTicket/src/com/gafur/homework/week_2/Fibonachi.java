package com.gafur.homework.week_2;

public class Fibonachi {
	public static int N = 6;
	static int count = 0;

	public static void main(String[] args) {
		
		
		

	}
	
	public void findFibonachi(int n, int i, int j){
		if(n == N){
			count++;
			return;
		}
		n = 0;
		i = 1;
		j = n + i;
		n = i;
//		findFibonachi(n,j,)
		
	}

}
