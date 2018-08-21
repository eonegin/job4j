package ru.job4j.max;

/**
 * Max.
 * Максимум из двух и из трех чисел.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Max {


    /**
     * Вычисляет максимум из двух чисел.
     *
     * @param first первое число.
     * @param second второе число.
     * @return возвращает максимум из двух чисел.
     */
    public int max(int first, int second) {
        return (first > second ? first : second);
    }

    /**
     * Вычисляет максимум из трех чисел.
     *
     * @param first первое число.
     * @param second второе число.
     * @param third тертье число.
     * @return возвращает максимум из трех чисел.
     */
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}
