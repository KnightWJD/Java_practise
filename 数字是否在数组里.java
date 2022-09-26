package com.company;

public class fangfa {
    public static boolean returnExist(int[] arr,int n ) {
        for (int i = 0; i < arr.length; i++) {
            if(n==arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        System.out.print(returnExist(arr,11));
    }

}

