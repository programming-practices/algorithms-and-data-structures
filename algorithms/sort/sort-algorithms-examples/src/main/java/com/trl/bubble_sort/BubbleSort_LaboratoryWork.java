package com.trl.bubble_sort;

import com.trl.InterfaceSort;

public class BubbleSort_LaboratoryWork implements InterfaceSort<Integer> {

//    public static int[] sort(int[] arg){
//
//        for (int barrier = 0; barrier < arg.length; barrier++) {
//            for(int index = arg.length - 1; index > barrier; index--){
//                if(arg[index] < arg[index - 1]){
//                    int tmp = arg[index - 1];
//                    arg[index - 1] = arg[index];
//                    arg[index] = tmp;
//                }
//            }
//        }
//        return arg;
//    }

    public void sort(Integer[] arg){
        for (int barrier = 0; barrier < arg.length; barrier++) {
            for(int index = arg.length - 1; index > barrier; index--){

                if(arg[index] < arg[index - 1]){
                    int tmp = arg[index];
                    arg[index] = arg[index - 1];
                    arg[index - 1] = tmp;
                }
            }
        }
    }
}
