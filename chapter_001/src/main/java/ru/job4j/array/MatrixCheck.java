package ru.job4j.array;

/**
 * MatrixCheck.
 * Проверяет то, что все элементы по диагоналям равны true или false.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class MatrixCheck {

    /**
     * Проверяет то, что все элементы по диагоналям равны true или false.
     *
     * @param data двухмерный входящий массив.
     * @return возвращает булево значение.
     */

    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i] || data[data.length - 1][0] != data[data.length - 1 - i][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}


