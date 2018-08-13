package ru.job4j.array;

public class DoubleBubbleSort {


    public static int[] doubleSort(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array3.length - 1; i++) {
            if(array1.length > array2.length){
                array3[i] = array1[i];
        }
        return array3;

    }

}



