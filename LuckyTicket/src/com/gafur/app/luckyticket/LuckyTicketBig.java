package com.gafur.app.luckyticket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class LuckyTicketBig {
	public static void main(String[] args) throws IOException {
		int luckyCount = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long ticketNumber = Long.parseLong(reader.readLine());
		System.out.println(luckyCount(ticketNumber));

		for (long i = 0; i < 1000000000000L; i++) {
			if (luckyCount(i)) {
				luckyCount++;
			}
		}
		System.out.println(luckyCount);

	}

	public static String addZeros(long number) {
		DecimalFormat zeroFormat = new DecimalFormat("000000000000");
		return zeroFormat.format(number) + "";
	}

	public static boolean luckyCount(long number) {
		int leftSum = 0;
		int rightSum = 0;

		char[] numberChar = addZeros(number).toCharArray();
		int[] numberInt = new int[12];
		for (int i = 0; i < numberChar.length; i++) {
			numberInt[i] = Character.getNumericValue(numberChar[i]);
		}

		for (int i = 0; i < 6; i++) {
			leftSum = leftSum + numberInt[i];
		}
		for (int i = 11; i > 5; i--) {
			rightSum = rightSum + numberInt[i];
		}

		if (leftSum == rightSum) {
			return true;
		} else {
			return false;
		}
	}
}
