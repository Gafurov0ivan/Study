package com.gafur.lessons.week_3.threading;

/**
 * @author igafurov
 * @since 21.10.2016
 */
public class ThreadLocalExample {
    static ThreadLocal<String> myThreadLocal = new ThreadLocal<>();

    // ��������� ������ ������
    public static void m1() {
        String someValue = "Hello";
        myThreadLocal.set(someValue);
        m2();
    }

    public static void m2() {

        myThreadLocal.set(myThreadLocal.get());
    }

    public static void main(String[] args) {
        ThreadLocalExample t = new ThreadLocalExample();
        try {
            t.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
