package recursion;

import java.util.Arrays;

/**
 * Sources: https://www.youtube.com/watch?v=1yOI0qznHfE&index=4&list=PLoij6udfBncifDy8AjaU5wcG_UDPjDSSb
 *          Nachalo 17:00
 * */
public class Permutator_LabaratoryWork {
    public static void permute (int[] arr, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = 0; i < size; i++) {
                swap(arr, i, size - 1);
                permute(arr, size - 1);
            }
        }
    }

    public static void swap(int[] arr, int index0, int index1) {
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}

class MainPermutator {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4};
        int[] array = {1, 2, 3};
        Permutator_LabaratoryWork.permute(array, array.length);
    }
}