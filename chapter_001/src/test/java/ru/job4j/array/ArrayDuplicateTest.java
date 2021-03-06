package ru.job4j.array;


import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ArrayDuplicateTest.
 * Тестирует метод remove класса ArrayDuplicate.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class ArrayDuplicateTest {

    /**
     * whenRemoveDuplicatesThenArrayWithoutDuplicate.
     * Позитивный тест
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{"Cat", "Mouse", "Mouse", "Dog", "Dog", "Bird"};
        String[] result = (ArrayDuplicate.remove(input));
        String[] expect = new String[]{"Cat", "Mouse", "Dog", "Bird"};
        Arrays.sort(result);
        Arrays.sort(expect);
        assertThat(result, is(expect));

    }
}
