package com.gafur.lessons.week_3.annotations;

/**
 * @author igafurov
 * @since 21.10.2016
 */
public class Vechicle {
    @MinLength(2)
    private String name;

    public Vechicle(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
