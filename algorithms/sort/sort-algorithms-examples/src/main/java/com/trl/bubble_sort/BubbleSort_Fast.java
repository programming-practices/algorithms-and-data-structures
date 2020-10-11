package com.trl.bubble_sort;

import java.util.Arrays;

public class BubbleSort_Fast {
    public static int[] sort(int[] arg) {
        for (int barrier = 0; barrier < arg.length - 1; barrier++) {
            int countChange = 0;
            for (int index = arg.length - 2; index >= barrier; index--) {
                if (arg[index] > arg[index + 1]) {
                    int tmp = arg[index];
                    arg[index] = arg[index + 1];
                    arg[index + 1] = tmp;
                    countChange++;
                }
            }
            if (countChange == 0) break;
        }
        return arg;
    }

    public static void sortM(int[] arg) {
        int find = 1;
        for (int i = 0; i < arg.length -1; i++) {
            for (int index = 0; index < arg.length - 1; index++) {
                if (arg[index] > arg[index + 1]) {
                    int tmp = arg[index];
                    arg[index] = arg[index + 1];
                    arg[index + 1] = tmp;
                    find++;
                }
            }
        }
    }
}

class Test {
    public static void main(String[] arg) {
        int[] array = {10, 6, 3, 9, 5, 2, 7, 4};
//		BubbleSort_Fast.sort(array);
//		System.out.println(Arrays.toString(array));
        BubbleSort_Fast.sortM(array);
        System.out.println(Arrays.toString(array));
    }
}
