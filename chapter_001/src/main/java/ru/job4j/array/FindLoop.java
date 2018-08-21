package ru.job4j.array;

/**
 * FindLoop.
 * Поиск входящего элемента во входящем массиве и вывод его индекса.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class FindLoop {

    /**
     * Удаляет дубли из массива.
     *
     * @param data входящий массив.
     * @param element входящий элемент.
     * @return возвращает индекс входящего элемента.
     */

    public int indexOf(int[] data, int element) {
        int result = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }
}