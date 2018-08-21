package ru.job4j.array;

/**
 * Square.
 * Заполнение массива числами возведенными в квадрат.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Square {

    /**
     * Заполняет массив числами возведенными в квадрат от 1 до bound.
     *
     * @param bound количество чисел.
     * @return возвращает копию массива без дублей.
     */

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++)
            rst[i - 1] = i * i;
        return rst;
    }
}
