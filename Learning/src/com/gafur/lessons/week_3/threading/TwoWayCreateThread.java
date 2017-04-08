package com.gafur.lessons.week_3.threading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author igafurov
 * @since 21.10.2016
 */
public class TwoWayCreateThread {
    public static AtomicInteger count = new AtomicInteger(0);

    // ������ ������ �������� ������
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hi");
        }
    }

    // ������ �������
    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                boolean f = false;
                while (!f) {
                    int c = count.get();
                    f = count.compareAndSet(c, c + 100);
                }
                // ����� �������� ��� ������ �� Thread ����� ���
                // Thread.currentThread()
            }
        }
    }

    public static void main(String[] args) {
        // ������ ������
        MyThread myThread = new MyThread();
        myThread.start();
        // ������ ������
        Thread[] threads = new Thread[8];
        for (int i = 0; i < 8; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(count);
    }
}
