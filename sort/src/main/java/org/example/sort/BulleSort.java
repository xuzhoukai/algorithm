package org.example.sort;

import org.example.BaseSort;

/**
 * 冒泡排序算法
 */
public class BulleSort implements BaseSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1,9,6,3,5,4};
        BulleSort b = new BulleSort();
        b.sort(arr);
    }

    @Override
    public int[] sort(int[] arr) {
        if (arr == null || arr.length == 0){
            return arr;
        }
        int tmp;
        for(int i = 0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
               }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        return arr;
    }
}
