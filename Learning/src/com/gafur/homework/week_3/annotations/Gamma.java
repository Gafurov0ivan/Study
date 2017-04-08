package com.gafur.homework.week_3.annotations;

/**
 * @author igafurov
 * @since 21.10.2016
 */
public class Gamma {

    @Test
    public boolean diapason(int item) {
        if (item > 30 && item <= 100) {
            return true;
        }
        return false;
    }
}
