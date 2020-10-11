package com.trl.bubble_sort;

public class BubbleSort_Golovach {

    public static int[] sort(int[] arg){
        for (int barrier = 0; barrier < arg.length - 1; barrier++) {
            for (int index = arg.length - 2; index >= barrier; index--) {

                if (arg[index] > arg[index + 1]){
                    int tmp = arg[index];
                    arg[index] = arg[index + 1];
                    arg[index + 1] = tmp;
                }
            }
        }
        return arg;
    }
}
