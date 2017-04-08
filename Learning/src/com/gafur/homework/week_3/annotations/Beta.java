package com.gafur.homework.week_3.annotations;

/**
 * @author igafurov
 * @since 21.10.2016
 */
public class Beta {

    @Test
    public boolean diapason(int item) {
        if (item > 13 && item <= 40) {
            return true;
        }
        return false;
    }
}
