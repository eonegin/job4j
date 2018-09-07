package ru.job4j.array;

/**
 * DoubleBubbleSort.
 * Объединяет два массива в один с одновременной сортировкой по возрастанию.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class DoubleBubbleSort {

    /**
     * Удаляет дубли из массива.
     *
     * @param array1 первый входящий массив.
     * @param array2 второй входящий массив.
     * @return возвращает массив состоящий из значений входящих массивов, отсортированный по возрастанию.
     */

    public static int[] doubleSort(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array3.length - 1; i++) {
            if (array1.length > array2.length) {
                array3[i] = array1[i];
            }
        }
        return array3;
    }
}



