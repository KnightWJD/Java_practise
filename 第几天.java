package com.company;

import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        int num = 0;
        num = (month-1)*30+day-2;
        if(year%4==0&&year%100!=0||year%400==0) {
            num--;
        }
        int i;
        for(i=1;i<=(month-1);i++) {
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
                num++;
            }

        }
        System.out.println(num);
    }


}
