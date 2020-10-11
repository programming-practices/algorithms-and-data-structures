package com.trl.quick_sort.a1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {

    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------------
//        // For integer input
//        int[] arr = {3, 4, 1, 32, 0, 2, 44, 111, 5};
//        Integer[] array = new Integer[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            array[i] = arr[i];
//        }
//
//        QS(array, 0, arr.length - 1);
//
//        //Output => 0 1 2 3 4 5 32 44 111
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        // String Input
//        String[] array1 = {"c", "a", "e", "b", "d"};
//
//        QS(array1, 0, array1.length - 1);
//
//        //Output => a	b	c	d	e
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] + "\t");
//        }
//---------------------------------------------------------------------------------------------------------------------
        int capacity = 10_000_000;
        Integer[] array = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = new Random().nextInt(capacity);
        }
        System.out.println("Generate array");

        long start = System.nanoTime();
        QS(array, 0, capacity - 1);
        long end = System.nanoTime();

        //Output => 0 1 2 3 4 5 32 44 111
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        System.out.println();
        System.out.println(end - start);
        System.out.println(123456789);
//---------------------------------------------------------------------------------------------------------------------
        System.out.println(quicksort(Arrays.asList(10, 5, 2, 3))); // [2, 3, 5, 10]
//---------------------------------------------------------------------------------------------------------------------
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     * This method implements the Generic Quick Sort
     *
     * @param array The array to be sorted
     * @param start The first index of an array
     * @param end   The last index of an array
     *              Sorts the array in increasing order
     **/
    public static <T extends Comparable<T>> void QS(T array[], int start, int end) {
        if (start < end) {
            int pIndex = partition(array, start, end);
            QS(array, start, pIndex - 1);
            QS(array, pIndex + 1, end);
        }
    }

    /**
     * This method finds the partition index for an array
     *
     * @param array The array to be sorted
     * @param start The first index of an array
     * @param end   The last index of an array
     *              Finds the partition index of an array
     **/
    public static <T extends Comparable<T>> int partition(T array[], int start, int end) {
        T pivot = array[end];
        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (array[i].compareTo(pivot) <= 0) {
                swap(array, i, pIndex);
                pIndex++;
            }
        }
        swap(array, pIndex, end);
        return pIndex;
    }

    /**
     * This method swaps two elements of an array
     *
     * @param array   The array to be sorted
     * @param initial The first element
     * @param fin     The second element
     *                Swaps initial and fin element
     **/
    public static <T extends Comparable<T>> void swap(T[] array, int initial, int fin) {
        T temp = array[initial];
        array[initial] = array[fin];
        array[fin] = temp;
    }
//----------------------------------------------------------------------------------------------------------------------
private static List<Integer> quicksort(List<Integer> list) {
    if (list.size() < 2) {
        // base case, arrays with 0 or 1 element are already "sorted"
        return list;
    } else {
        // recursive case
        Integer pivot = list.get(0);

        // sub-array of all the elements less than the pivot
        List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot)
                .collect(Collectors.toList());

        // sub-array of all the elements greater than the pivot
        List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot)
                .collect(Collectors.toList());

        return Stream.of(
                quicksort(less).stream(),
                Stream.of(pivot),
                quicksort(greater).stream())
                .flatMap(Function.identity()).collect(Collectors.toList());
    }
}
//----------------------------------------------------------------------------------------------------------------------
}

/*
------------------------------------------------------------------------------------------------------------------------
Алгоритм быстрой сортировки уникален тем, что его скорость зависит от выбора опорного элемента.
------------------------------------------------------------------------------------------------------------------------
*/
