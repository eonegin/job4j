package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DubleBubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        DoubleBubbleSort doubleBubbleSort = new DoubleBubbleSort();
        int[] input1 = new int[]{1, 5, 4, 2};
        int[] input2 = new int[]{2, 9, 0};
        int[] result = DoubleBubbleSort.doubleSort(input1, input2);
        int[] expect = new int[]{0, 1, 2, 2, 4, 5, 9};
        assertThat(result, is(expect));
    }
}

