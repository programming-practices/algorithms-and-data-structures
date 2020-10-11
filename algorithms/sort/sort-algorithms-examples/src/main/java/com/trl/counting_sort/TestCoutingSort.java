package com.trl.counting_sort;

import com.trl.counting_sort.a1.CountingSort;

public class TestCoutingSort {
    public static void main(String[] args) {
// --------------------------------------------------------------------------------------------------------------------
        // Integer Input
//        Integer[] arr1 = {4,23,6,78,1,54,231,9,12};
        Integer[] arr1 = {1,4,23,231,6,78,1,4,54,231,1,9,12};
        int last = arr1.length;

        System.out.println("Before Sorting:");
        for (Integer anArr1 : arr1) System.out.print(anArr1 + " ");
        System.out.println();

        CountingSort.CS(arr1, last);

        // Output => 1 4 6 9 12 23 54 78 231
        System.out.println("After Sorting:");
        for (Integer anArr1 : arr1) System.out.print(anArr1 + " ");
        System.out.println();

        System.out.println("------------------------------");

        // String Input
        String[] array1 = {"c", "a", "e", "b","d"};
        last = array1.length;

        System.out.println("Before Sorting:");
        for (String s : array1) System.out.print(s + " ");
        System.out.println();

        CountingSort.CS(array1, last);

        // Output => a b c d e
        System.out.println("After Sorting:");
        for (int i = 0; i < last; i++) System.out.print(array1[i] + " ");
// ---------------------------------------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------------------------------------
    }
}
