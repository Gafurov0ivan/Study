package com.gafur.homework.week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Find all possible lucky tickets in set of 6 numbers
 *
 * @author igafurov
 * @since 10.10.2016
 */
public class LuckyTicket {
    public static void main(String[] args) throws IOException {
        int luckyCount = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int ticketNumber = Integer.parseInt(input);
        System.out.println(luckyCount(ticketNumber));

        for (int i = 0; i < 1000000; i++) {
            if (luckyCount(i)) {
                luckyCount++;
            }
        }
        System.out.println(luckyCount);
    }

    public static String addZeros(int number) {
        DecimalFormat zeroFormat = new DecimalFormat("000000");
        return zeroFormat.format(number) + "";
    }

    public static boolean luckyCount(int number) {

        char[] numberChar = addZeros(number).toCharArray();
        int[] numberInt = new int[6];
        for (int i = 0; i < numberChar.length; i++) {
            numberInt[i] = Character.getNumericValue(numberChar[i]);
        }

        int leftSum = numberInt[0] + numberInt[1] + numberInt[2];
        int rightSum = numberInt[3] + numberInt[4] + numberInt[5];

        if (leftSum == rightSum) {
            return true;
        } else {
            return false;
        }
    }
}
