package ru.job4j.loop;

/**
 * Counter.
 * Подсчет суммы чётных чисел в диапазоне.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Counter {

    /**
     * Удаляет дубли из массива.
     *
     * @param start  начало диапазона.
     * @param finish конец диапазона.
     * @return возвращает сумму четных чисел внутри заданного диапазона.
     */
    public static int add(int start, int finish) {
        int res = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }
        return res;
    }
}

