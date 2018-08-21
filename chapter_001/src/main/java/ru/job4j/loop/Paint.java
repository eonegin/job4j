package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Paint.
 * Построение пирамиды в псевдографике.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Paint {

    /**
     * Отрабатывает loopBy в соответсвии с заданным параметром высоты.
     *
     * @param height входящий параметр высоты.
     * @return результат.
     */

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Рисует пирамиду.
     *
     * @param height входящий параметр высоты.
     * @param weight входящий параметр ширины.
     *
     * @return сочетание строк в виде пирамиды.
     */
    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
