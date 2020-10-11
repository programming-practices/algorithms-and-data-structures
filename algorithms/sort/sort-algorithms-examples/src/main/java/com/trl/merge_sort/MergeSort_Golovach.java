package com.trl.merge_sort;

public class MergeSort_Golovach {

    public static int[] merger(int[] a, int[] b){   //   wrong!!!!!!
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        while((aIndex + bIndex) != (result.length)){
            if(a[aIndex] < b[bIndex]){
                if(aIndex < a.length - 1){
                    result[aIndex + bIndex] = a[aIndex++];
                }else {
                    result[aIndex + bIndex] = a[aIndex];
                }
            }else if(a[aIndex] >= b[bIndex]){
                if(aIndex < a.length - 1){
                    result[aIndex + bIndex] = a[aIndex++];
                }else {
                    result[aIndex + bIndex] = a[aIndex];
                }
            }

            if(b[bIndex] < a[aIndex]){
                if(bIndex < b.length - 1){
                    result[aIndex + bIndex] = b[bIndex++];
                }else {
                    result[aIndex + bIndex] = b[bIndex];
                }
            }else if(b[bIndex] >= a[aIndex]){
                if(bIndex < b.length - 1){
                    result[aIndex + bIndex] = b[bIndex++];
                }else {
                    result[aIndex + bIndex] = b[bIndex];
                }
            }
        }
        return result;
    }

}
