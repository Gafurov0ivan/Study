package com.gafur.lessons.week_1;

/**
 * @author igafurov
 * @since 10.10.2016
 */
public class Task4 {

    public static void main(String[] args) {
        // ��������� ��� �����
        double d1 = 1.3425434545345d;
        double d2 = 1.3534565645656d;
        // �� �����
        if (Math.abs(d1 - d2) <= 1e-8) {
        }
        // �� ������, ������
        if (d1 - d2 > 1e-8) {
        }
        int i = 1;
        System.out.println(i / 2);
    }

    //	��������
    public int rec(int i) {
        if (i == 0) {
            return 1;
        }
        return rec(i - 1) * i;
    }
}
