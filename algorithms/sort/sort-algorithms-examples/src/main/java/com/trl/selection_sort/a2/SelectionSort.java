package com.trl.selection_sort.a2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectionSort {

    private static List<Integer> selectionSort(List<Integer> arr) {
        // TODO Finish writing this code.
        List<Integer> arrSource = new ArrayList<>();
        ((ArrayList<Integer>) arrSource).ensureCapacity(arr.size());
        Collections.copy(arrSource, arr);
//        Collections.copy(arr, arrSource);
        List<Integer> newArr = new ArrayList<>(arr.size());

        int size = arrSource.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arrSource);
            newArr.add(arrSource.get(smallest));

            arrSource.remove(smallest);
        }

        return newArr;
    }

    private static void selectionSortThis(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>(arr.size());

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);
            newArr.add(arr.get(smallest));

            arr.remove(smallest);
        }

        arr.addAll(newArr);
    }

    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
//        arr = selectionSort(arr); //[2, 3, 5, 6, 10]
        System.out.println(selectionSort(arr));
//        System.out.println(arr);
    }
}
