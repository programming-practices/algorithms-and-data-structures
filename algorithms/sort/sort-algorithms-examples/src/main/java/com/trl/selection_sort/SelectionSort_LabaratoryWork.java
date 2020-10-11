package com.trl.selection_sort;

public class SelectionSort_LabaratoryWork {

    public static int[] sort(int[] arg){
        for (int barrier = 0; barrier < arg.length; barrier++) {

            int value = arg[barrier];
            int indexMin = barrier;

            for (int index = barrier; index < arg.length; index++) {
                if (arg[index] < value){
                    indexMin = index;
                    value = arg[index];
                }
            }

//            for (int index = barrier; index < arg.length; index++) {
////                int valureSegond = arg[index];
//                if (arg[index] < arg[barrier]){
//                    indexMin = index;
//                    arg[barrier] = arg[index];
//                }
//            }

//            System.out.println(indexMin);
//            System.out.println(Arrays.toString(arg));
            int tmp = arg[indexMin];
            arg[indexMin] = arg[barrier];
            arg[barrier] = tmp;
//            System.out.println(Arrays.toString(arg));
        }

        return arg;
    }
}
