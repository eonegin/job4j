package ru.job4j.loop;

/**
 * Board.
 * Построение шахматной доски в псевдографике.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Board {

    /**
     * Удаляет дубли из массива.
     *
     * @param width ширина.
     * @param height высота.
     * @return возвращает сочетание строк в заивисимости от входящих параметров.
     */

    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // условие проверки, что писать пробел или X
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}

