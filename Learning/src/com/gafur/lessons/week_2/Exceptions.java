package com.gafur.lessons.week_2;

/**
 * @author igafurov
 * @since 15.10.2016
 */
public class Exceptions {
    public static double m(int a) throws MyException, MyException2 {
        return a;

    }

    public static void main(String[] args) {
        try {
            m(10);
        } catch (MyException | MyException2 e) {
            e.printStackTrace();
        } finally {
        }
    }
}

