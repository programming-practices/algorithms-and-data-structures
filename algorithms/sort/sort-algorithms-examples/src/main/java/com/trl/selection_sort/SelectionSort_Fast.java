package com.trl.selection_sort;


import com.trl.InterfaceSort;

public class SelectionSort_Fast implements InterfaceSort<Integer> {

    public void sort(Integer[] arg) {
        // TODO Dodelat albaratornyy raboty po yskoreniy etoi sortirovki
        // https://www.youtube.com/watch?v=xP90b2zSl8M&list=PLoij6udfBncjzPJ4yyysa4Fqz1BrZH3g9&index=2
        // S 1:12 minytu po 15:00
        for (int barrier = 0; barrier < arg.length - 1; barrier++) {
            int minindex = arg[barrier];
            for (int index = barrier + 1; index < arg.length; index++) {

                if (arg[barrier] > arg[index]) {
                    minindex = index;
                }
            }
            int tmp = arg[minindex];
            arg[minindex] = arg[barrier];
            arg[barrier] = tmp;
        }
    }
}



