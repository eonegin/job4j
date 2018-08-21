package ru.job4j.segments;

/**
 * CrossSegments.
 * Определяет по заданным точкам пересекаются ли отрезки.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class CrossSegments {

    /**
     * contains result true or false
     */
    static boolean result = false;

    /**
     * Определяет пересекаются ли отрезки
     *
     * @param a начальная точка певрого отрезка
     * @param b конечная точка первого отрезка
     * @param c начальная точка второго отрезка
     * @param d конечная точка второго отрезка
     * @return true если отрезки пересекаются
     */
    public static boolean segments(int a, int b, int c, int d) {
        if ((c <= b && c >= a) || (d <= b && d >= a)) {
            result = true;
        }
        return result;
    }
}
