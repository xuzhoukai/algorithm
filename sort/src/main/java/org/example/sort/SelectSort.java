package org.example.sort;

/**
 * 选择排序算法
 */
public class SelectSort implements BaseSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,9,6,3,5,4};
        BaseSort b = new SelectSort();
        b.sort(arr);
    }
    @Override
    public int[] sort(int[] arr) {
        int minIndex;
        int tmp;
        for(int i=0;i<arr.length;i++){
            minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex =j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        return arr;
    }
}
