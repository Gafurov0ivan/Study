package com.gafur.lessons.week_1;

/**
 * @author igafurov
 * @since 10.10.2016
 */
public class Oop {

    public static void main(String[] args) {
        User user = new User();
        user.setUser("newUserName");
        System.out.println(user.getUser());
    }
}
