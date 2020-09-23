package org.example.sort;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 插入排序算法
 */
public class InsertSort implements BaseSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,9,6,3,5,4};
        BaseSort b = new InsertSort();
        b.sort(arr);
    }
    @Override
    public int[] sort(int[] arr) {
        int tmp;
        int preIndex;
        for(int i=1;i<arr.length;i++){
            preIndex = i-1;
            tmp = arr[i];
            while (tmp<arr[preIndex]&& preIndex>=0){
                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1] = tmp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        return arr;
    }
}
