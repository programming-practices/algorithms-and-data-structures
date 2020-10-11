package com.trl.counting_sort.a1;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

// Source: https://www.youtube.com/watch?v=6dk_csyWif0
public class CountingSort {

    /**
     * This method implements the Generic Counting Sort
     *
     * @param array The array to be sorted
     * @param last  The count of total number of elements in array
     *              Sorts the array in increasing order
     *              It uses array elements as keys in the frequency map
     **/
    public static <T extends Comparable<T>> void CS(T[] array, int last) {

        Map<T, Integer> frequency = new TreeMap<>();
        // The final output array
        ArrayList<T> sortedArray = new ArrayList<>();

        // Counting the frequency of @param array elements
        for (T t : array) {
            try {
                frequency.put(t, frequency.get(t) + 1);
            } catch (Exception e) { // new entry
                frequency.put(t, 1);
            }
        }

        // Filling the sortedArray
        for (Map.Entry<T, Integer> element : frequency.entrySet()) {
            for (int j = 0; j < element.getValue(); j++)
                sortedArray.add(element.getKey());
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = sortedArray.get(i);
        }
    }


}


/*

Важно отметить:
    1. Сортировка подсчетом достаточно эффективна, если диапазон чисел массива не сильно превосходит количество самих
       чисел. Поразмышляйте над такой ситуацией: [10000, 5000, 5, 10] и диапазон [5; 10000] соответственно.
    2. Временная сложность алгоритма составляет O(n), сложность по памяти пропорциональна размеру диапазона.
    3. Если диапазон не известен заранее, его можно определить также за линейное время, выполнив поиск минимума и
       максимума в массиве.

*/
