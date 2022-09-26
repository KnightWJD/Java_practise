package com.company;

public class fangfa {
    public static void printArr(int[] arr) {
        System.out.print("{");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1) {
                System.out.print(",");
            }
        }
        System.out.printf("}");
    }

    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        printArr(arr);
    }

}
