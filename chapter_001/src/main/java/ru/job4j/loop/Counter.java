package ru.job4j.loop;

public class Counter {


    public static int add(int start, int finish) {
        int res = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) res += i;
        }
        return res;
    }
}

