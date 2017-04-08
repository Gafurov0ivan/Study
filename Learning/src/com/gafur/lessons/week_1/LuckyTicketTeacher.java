package com.gafur.lessons.week_1;

/**
 * @author igafurov
 * @since 10.10.2016
 */
public class LuckyTicketTeacher {

    public static void main(String[] args) {
        int count = 0;

        for (int j0 = 0; j0 < 10; j0++)
            for (int j1 = 0; j1 < 10; j1++)
                for (int j2 = 0; j2 < 10; j2++)
                    for (int j3 = 0; j3 < 10; j3++)
                        for (int j4 = 0; j4 < 10; j4++)
                            for (int j5 = 0; j5 < 10; j5++)
                                if (j0 + j1 + j2 == j3 + j4 + j5) {
                                    count++;
                                }
        System.out.println(count);
    }
}



