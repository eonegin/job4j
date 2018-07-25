package ru.job4j.segments;

public class CrossSegments {

    static boolean result = false;

    public static boolean segments(int a, int b, int c, int d) {
        if ((c <= b && c >= a) || (d <= b && d >= a)) {
            result = true;
        }
        return result;
    }
}
