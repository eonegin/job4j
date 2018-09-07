package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MatrixCheckTest.
 * Тестирует метод mono класса MatrixCheck.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class MatrixCheckTest {

    /**
     * whenDataMonoByTrueThenTrue.
     * Позитивный тест. Матрица 3х3. true по диагонали.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * whenDataNotMonoByTrueThenFalse.
     * Негативный тест. Матрица 3х3.
     */

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * whenDataMonoByTrueThenTrue.
     * Позитивный тест. Матрица 2х3. true и false по диагонали.
     */

    @Test
    public void whenDataLittleTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false},
                {false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * whenDataNotMonoByTrueThenFalse.
     * Негативный тест. Матрица 2х2.
     */

    @Test
    public void whenDataLittleFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true},
                {false, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * whenDataNotMonoByTrueThenFalse.
     * Негативный тест. Матрица 3х3.
     */

    @Test
    public void whenDataNotMonoByTrueThenFalseSecond() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

}