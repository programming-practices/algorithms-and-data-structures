package com.trl.bubble_sort;

import java.util.Random;

public class BubbleSort {
    /**
     * This method implements the Generic Bubble Sort
     *
     * @param array The array to be sorted
     * @param last  The count of total number of elements in array
     *              Sorts the array in increasing order
     **/

    public static <T extends Comparable<T>> void BS(T array[], int last) {
        //Sorting
        boolean swap;
        do {
            swap = false;
            for (int count = 0; count < last - 1; count++) {
                int comp = array[count].compareTo(array[count + 1]);
                if (comp > 0) {
                    T temp = array[count];
                    array[count] = array[count + 1];
                    array[count + 1] = temp;
                    swap = true;
                }
            }
            last--;
        } while (swap);
    }

    // Driver Program
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------------
//        // Integer Input
//        int[] arr1 = {4, 23, 6, 78, 1, 54, 231, 9, 12};
//        int last = arr1.length;
//        Integer[] array = new Integer[last];
//        for (int i = 0; i < last; i++) {
//            array[i] = arr1[i];
//        }
//
//        BS(array, last);
//
//        // Output => 1	  4	 6	9	12	23	54	78	231
//        for (int i = 0; i < last; i++) {
//            System.out.print(array[i] + "\t");
//        }
//        System.out.println();
//
//        // String Input
//        String[] array1 = {"c", "a", "e", "b", "d"};
//        last = array1.length;
//
//        BS(array1, last);
//
//        //Output => a	  b	 c	d	e
//        for (int i = 0; i < last; i++) {
//            System.out.print(array1[i] + "\t");
//        }
//---------------------------------------------------------------------------------------------------------------------
        int capacity = 100_000;
        Integer[] array = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = new Random().nextInt(capacity);
        }

        long start = System.nanoTime();
        BS(array, capacity);
        long end = System.nanoTime();

//        Output => 0 1 2 3 4 5 32 44 111
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(end - start);
        System.out.println(123456789);
//---------------------------------------------------------------------------------------------------------------------
    }
}
