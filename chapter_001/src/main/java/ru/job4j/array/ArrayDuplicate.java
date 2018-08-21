package ru.job4j.array;

import java.util.Arrays;

/**
 * ArrayDuplicate.
 * Удаление дублей из массива.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class ArrayDuplicate {

    /**
     * Удаляет дубли из массива.
     *
     * @param array входящий массив.
     * @return возвращает копию массива без дублей.
     */

    public static String[] remove(String[] array) {
        int dubl = array.length;
        for (int i = 0; i < dubl; i++) {
            for (int j = i + 1; j < dubl; j++) {
                if (array[i].equals(array[j])) {
                    array[i] = array[dubl - 1];
                    dubl--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, dubl);
    }
}





