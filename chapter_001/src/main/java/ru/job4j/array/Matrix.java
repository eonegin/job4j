package ru.job4j.array;

/**
 * Matrix.
 * Построение матрицы таблицы умножение на основе заданного размера.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Matrix {

    /**
     * Возвращает двухмерный массив с таблицей умножения.
     *
     * @param size входящий размер таблицы.
     * @return возвращает двухмерный массив заданного размера.
     */

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}