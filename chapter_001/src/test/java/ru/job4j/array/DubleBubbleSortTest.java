package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * DubleBubbleSortTest.
 * Тестирует метод doubleSort класса DoubleBubbleSort.
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class DubleBubbleSortTest {

    /**
     * whenStartWithPrefixThenTrue.
     * Позитивный тест слияния и сортировки двух массивов ращличной длинны
     */
    //@Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        DoubleBubbleSort doubleBubbleSort = new DoubleBubbleSort();
        int[] input1 = new int[]{1, 5, 4, 2};
        int[] input2 = new int[]{2, 9, 0};
        int[] result = DoubleBubbleSort.doubleSort(input1, input2);
        int[] expect = new int[]{0, 1, 2, 2, 4, 5, 9};
        assertThat(result, is(expect));
    }
}

