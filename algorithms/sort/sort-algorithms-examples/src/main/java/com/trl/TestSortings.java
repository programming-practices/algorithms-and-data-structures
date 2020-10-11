package com.trl;

import com.trl.insertion_sort.InsertionSort_Golovach;

import java.util.Arrays;

public class TestSortings {
    public static void main(String[] args) {
        String[][] arrStrings = {
                {},
                {"a"},
                {"b", "C", "D", "a", "B", "c", "d", "A"},
                {"Now", "now", "is", "AAa", "the", "time", "for", "all", "good", "Zaq", "men",
                        "to", "come", "to", "Asw", "the", "aid", "of", "their", "Aaa", "country", "Zzz"}
        };
        Integer[][] arrIntegers = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 123, 5, 4, 1, 2, 0, 9, 7},
        };
// ---------------------------------------- Test Bubble Sort -----------------------------------------------------------
//        showSortedArray(data, new BubbleSort_Golovach2());
//        showSortedArray(data, new BubbleSort_LaboratoryWork());

        // ------------- Bubble Sort String
//        showSortedArray(strings, new BubbleSort_String());

// ---------------------------------------- Test Selection Sort -------------------------------------------------------
//        showSortedArray(arrIntegers, new SelectionSort_Golovach());
//        showSortedArray(arrIntegers, new SelectionSort_Fast());

        //        int[] ints1 = new int[32 * 1024];
//        Random random1 = new Random(47);
//        for(int i = 0; i < ints1.length; i++){
//            ints1[i] = random1.nextInt();
//        }
//
//        long startTime1 = System.nanoTime();
//        SelectionSort_LabaratoryWork.sort(ints1);
//        long finalTime1 = System.nanoTime();
//        System.out.println((finalTime1 - startTime1) / 1_000_000);



//        int[] ints = new int[32 * 1024];
//        Random random = new Random(47);
//        for(int i = 0; i < ints.length; i++){
//            ints[i] = random.nextInt();
//        }
//
//        long startTime = System.nanoTime();
//        SelectionSort_Golovach.sort(ints);
//        long finalTime = System.nanoTime();
//        System.out.println((finalTime - startTime) / 1_000_000);

// -------------------------------------------- Test Insertion Sort ----------------------------------------------------
        showSortedArray(arrIntegers, new InsertionSort_Golovach());

// ---------------------------------------------------------------------------------------------------------------------

    }

    /**
     * @param data array for sorting
     * @param sorter type of sorting
     *
     * */
    private static <T> void showSortedArray(T[][] data, InterfaceSort sorter){
        for (T[] arr : data) {
            System.out.println("************************************************************************");
            System.out.print(Arrays.toString(arr) + " -> ");
            long start = System.nanoTime();
            sorter.sort(arr);
            long end = System.nanoTime();
            System.out.println(Arrays.toString(arr));
            System.out.println("Time in work: " + (end - start));
        }
    }
}
