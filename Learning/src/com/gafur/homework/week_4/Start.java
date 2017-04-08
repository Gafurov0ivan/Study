package com.gafur.homework.week_4;

import java.util.Random;

/**
 * Start application
 *
 * @author igafurov
 * @since 27.10.2016
 */
public class Start {

    public static void main(String[] args) {
        int[] array = new int[1_000];
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            int item = randomGenerator.nextInt(10);
            array[i] = item;
        }

        for (int value : array) {
            System.out.print(value + " ");
        }

        for (int value : array) {
            System.out.println(value);
        }
    }
}
