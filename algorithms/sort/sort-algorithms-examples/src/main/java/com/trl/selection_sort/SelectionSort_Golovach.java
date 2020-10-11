package com.trl.selection_sort;


import com.trl.InterfaceSort;

public class SelectionSort_Golovach implements InterfaceSort<Integer> {

    // ne samui optimalnui variant rewenia etoi zadachi
    public void sort(Integer[] arg){

        for (int barrier = 0; barrier < arg.length - 1; barrier++) {
            for (int index = barrier + 1; index < arg.length; index++) {

                if (arg[barrier] > arg[index]){
                    int tmp = arg[index];
                    arg[index] = arg[barrier];
                    arg[barrier] = tmp;
                }
            }
        }
    }
}
