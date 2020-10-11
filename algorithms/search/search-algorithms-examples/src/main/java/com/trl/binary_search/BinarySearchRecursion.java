package com.trl.binary_search;

import java.util.Arrays;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] argSource = {1, 3, 5, 7, 9};

        System.out.println(binarySearchRecursion(argSource, 3)); // 1
//        System.out.println(binarySearchRecursion(argSource, -1)); // null
    }

    // TODO Zakonchit eto method ili peredlat.
    public static int binarySearchRecursion(int[] arg, int searchItem) {

        if (arg.length > 2) {

            int low = 0;
            int high = arg.length - 1;

            int mid = (low + high) / 2;
            int guess = arg[mid];
            if (guess == searchItem) {
                return mid;
            }
            if (guess > searchItem) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            return binarySearchRecursion(Arrays.copyOfRange(arg, low, high), searchItem);
        } else {

            return 0;
        }
    }
}
