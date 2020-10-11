package com.trl.selection_sort.a1;

import java.util.Arrays;

/**
 *  SelectionSort imeet sloznost n^2
 *
 * */
public class SelectionSort {

    /**
     * Swaps the elements at indexes i and j.
     */
    private static void swapElements(int[] array, int indexReal, int indexLow) {
        int temp = array[indexReal];
        array[indexReal] = array[indexLow];
        array[indexLow] = temp;
    }

    /**
     * Finds the index of the lowest value
     * between indices low and high (inclusive).
     */
    private static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public static void selectionSort(int[] array) {
        for (int indexReal = 0; indexReal < array.length; indexReal++) {
            int indexLow = indexLowest(array, indexReal);
            swapElements(array, indexReal, indexLow);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 1, 3, 5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

}

