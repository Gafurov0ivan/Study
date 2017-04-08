package com.gafur.homework.week_3.annotations;

/**
 * @author igafurov
 * @since 21.10.2016
 */
public class Alpha {

    @Test
    public boolean diapason(int item) {
        if (item >= 8 && item <= 13) {
            return true;
        }
        return false;
    }
}