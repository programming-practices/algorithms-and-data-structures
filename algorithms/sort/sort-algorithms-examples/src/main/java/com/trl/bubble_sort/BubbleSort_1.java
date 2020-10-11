package com.trl.bubble_sort;

public class BubbleSort_1 {
    public static int[] sort(int[] arg){

        for (int barrier = 0; barrier < arg.length; barrier++) {
            for (int index = 0; index < arg.length - 1; index++) {

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
