package ru.job4j.loop;

/**
 * Factorial.
 * Вычисление факториала.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Factorial {

    /**
     * Удаляет дубли из массива.
     *
     * @param number входящее положиельное числол.
     * @return возвращает факториал числа number.
     */
    public static int calc(int number) {
        int res = 1;
        for (int i = 1; i <= number; i++) {
            res *= i;
        }
        return res;
    }
}
