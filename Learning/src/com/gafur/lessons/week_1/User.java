package com.gafur.lessons.week_1;

/**
 * @author igafurov
 * @since 10.10.2016
 */
public class User {

    public static final String DEFAULT = "default";
    private long id;
    private String username;
    private String password;
    private int age;

    public User() {
        setId(0);
        username = DEFAULT;
    }

    public User(long id, String username, String password) {
        this.setId(id);
        this.username = username;
    }

    public User(long id, String username, String password, int age) {
        this(id, username, password);
        this.age = age;
    }

    public String getUser() {
        return username;
    }

    public void setUser(String user) {
        this.username = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
