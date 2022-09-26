package com.company;

public class fangfa {
    public static int returnMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        System.out.printf("%d",returnMax(arr));
    }

}
