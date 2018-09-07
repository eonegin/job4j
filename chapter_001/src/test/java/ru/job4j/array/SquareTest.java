package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * SquareTest.
 * Тестирует метод calculate класса Square.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class SquareTest {

    /**
     * whenBound3Then149.
     * Позитивный тест. Массив 3-х чисел возведенных в квадрат.
     */

    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * whenBound1491625Then.
     * Позитивный тест. Массив 5-и чисел возведенных в квадрат.
     */
    @Test
    public void whenBound1491625Then() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }

    /**
     * whenBound1491625Then.
     * Негативный тест. Массив 0 чисел возведенных в квадрат.
     */
    @Test
    public void whenBound0Then() {
        int bound = 0;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{};
        assertThat(rst, is(expect));
    }
}
