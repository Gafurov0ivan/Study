package com.gafur.lessons.week_2;

import java.io.Serializable;

/**
 * @author igafurov
 * @since 15.10.2016
 */
public enum myEnum implements Serializable {
    JANUARY("January"), FEBRARY("February");

    private String displayName;

    private myEnum(String s) {
        this.displayName = s;
    }
}
