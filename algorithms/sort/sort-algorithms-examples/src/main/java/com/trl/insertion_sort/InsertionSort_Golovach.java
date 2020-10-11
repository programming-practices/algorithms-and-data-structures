package com.trl.insertion_sort;


import com.trl.InterfaceSort;

public class InsertionSort_Golovach implements InterfaceSort<Integer> {

    public void sort(Integer[] arg){

        for (int barrier = 1; barrier < arg.length; barrier++) {
            int newElement = arg[barrier];
            int location = barrier - 1;

            while (location >= 0 && arg[location] > newElement){
                arg[location + 1] = arg[location];
                location--;
            }
            arg[location + 1] = newElement;
        }
    }
}
