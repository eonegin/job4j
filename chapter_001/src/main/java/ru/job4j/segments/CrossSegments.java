package ru.job4j.segments;

public class CrossSegments {

    static boolean result = false;

    /**
     * @param a начальная точка певрого отрезка
     * @param b конечная точка первого отрезка
     * @param c начальная точка второго отрезка
     * @param d конечная точка второго отрезка
     * @return true если отрезк пересекаются
     */
    public static boolean segments(int a, int b, int c, int d) {
        if ((c <= b && c >= a) || (d <= b && d >= a)) {
            result = true;
        }
        return result;
    }
}
