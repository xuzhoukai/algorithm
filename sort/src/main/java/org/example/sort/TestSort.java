package org.example.sort;

public class TestSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,9,6,3,5,4};
        BaseSort b = new BulleSort();
        b.sort(arr);
        b = new InsertSort();
        b.sort(arr);
        b = new SelectSort();
        b.sort(arr);

        
    }
}
