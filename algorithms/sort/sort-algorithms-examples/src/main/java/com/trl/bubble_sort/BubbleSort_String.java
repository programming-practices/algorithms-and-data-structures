package com.trl.bubble_sort;

import com.trl.InterfaceSort;

// A bubble_sort sort for Strings.
public class BubbleSort_String implements InterfaceSort<String> {

    public void sort(String[] arr) {

        for(int barrier = 0; barrier < arr.length; barrier++) {
            for(int index = barrier + 1; index < arr.length; index++) {
                if(arr[index].compareTo(arr[barrier]) < 0) {
                    String tmp = arr[barrier];
                    arr[barrier] = arr[index];
                    arr[index] = tmp;
                }
            }
        }
    }
}

