package com.company;

public class yuanzhuo {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int m=2;
        int k=2;
        int i=k-1;
        int count=0;

        int a =0;
        while(count!=11) {
            if(num[i]==0) {
                i++;
                if(i==12) {
                    i=0;
                }
                continue;
            }
            a++;
            if(a%2==0) {
                num[i]=0;
                count++;
            }
            i++;
            if(i==12) {
                i=0;
            }
        }
        i=0;
        while(num[i]==0 ) {
            i++;
            if(i==11)break;
        }
        System.out.println(num[i]);



    }
}
