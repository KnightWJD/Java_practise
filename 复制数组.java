package com.company;

public class fangfa {
    public static int[] copyArr(int[] arr, int from, int to) {
        int[] arr1 = new int[to-from+1];
        int j = 0;

        for (int i = from - 1; i < to; i++) {
            arr1[j++] = arr[i];
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int from = 2;
        int to = 4;
        int[] arr1 = copyArr(arr, from, to);
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ", arr1[i]);
        }
    }
}






