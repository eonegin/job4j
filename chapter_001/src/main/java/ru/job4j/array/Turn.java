package ru.job4j.array;

/**
 * Turn.
 * Переворот массива задом на перед.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Turn {

    /**
     * Переворачивает входящий массив задом наперед.
     *
     * @param array входящий массив.
     * @return возвращает копию перевернутого массива.
     */

    public int[] turn(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            int j = array[i];
            int k = array[array.length - 1 - i];
            array[array.length - 1 - i] = j;
            array[i] = k;
        }
        return array;
    }
}