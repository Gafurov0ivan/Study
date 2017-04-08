package com.gafur.lessons.week_3.annotations;

/**
 * @author igafurov
 * @since 21.10.2016
 */
public class User {
    @MinLength(4)
    private String name;
    private String password;

    public User(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
