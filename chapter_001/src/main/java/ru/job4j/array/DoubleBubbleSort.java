package ru.job4j.array;

public class DoubleBubbleSort {


    public static int[] doubleSort(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                array3[k] = array1[i];
                i++;
            } else {
                array3[k] = array2[j];
                j++;
            }
            k++;
        }
        if (i < array1.length) {
            for (int p = i; p < array1.length; p++) {
                array3[k] = array1[p];
                k++;
            }
        } else {
            for (int p = j; p < array2.length; p++) {
                array3[k] = array2[p];
                k++;
            }
            BubbleSort doubleBubbleSortRes = new BubbleSort();
            doubleBubbleSortRes.sort(array3);
        }
        return array3;
    }
}

