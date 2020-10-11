package com.trl.bubble_sort;

import com.trl.InterfaceSort;

public class BubbleSort_Golovach2 implements InterfaceSort<Integer> {

    @Override
    public void sort(Integer[] arg){
        for (int barrier = arg.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {

                if (arg[index] > arg[index + 1]){
                    int tmp = arg[index];
                    arg[index] = arg[index + 1];
                    arg[index + 1] = tmp;
                }
            }
        }
    }
}
