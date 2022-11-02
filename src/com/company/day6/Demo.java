package com.company.day6;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        // testMonthDay(1);
        // greatestOf3(8, 8, 5);

        int x = 10;
        System.out.println("enter a number :");
        Scanner sc = new Scanner(System.in);
        int capturedInput = sc.nextInt();
        System.out.println("Input taken is :" +capturedInput);

        //sc.nextInt();  //capture int input

        // sc.next();     //capture the string
    }
/*
    public static void testMonthDay(int month) {
        if (month == 1) {
            System.out.println("31");
        } else if (month == 2) {
            System.out.println("31");
        } else if (month == 3) {
            System.out.println("31");
        } else if (month == 4) {
            System.out.println("31");
        } else if (month == 5) {
            System.out.println("31");
        } else if (month == 6) {
            System.out.println("31");
        } else if (month == 7) {
            System.out.println("31");
        } else if (month == 8) {
            System.out.println("31");
        } else {
            System.out.println("wrong");
        }
    }

    public static void greatestOf3(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("largest number is : " + a);
        } else if (b >= c && b >= a) {
            System.out.println("largest number is : " + b);
        } else {
            System.out.println("largest number is :" + c);
        }
    }

    public static void checkEligibility(boolean isActive) {
        if (isActive) {
            System.out.println("not eligible");
        }
    }
*/

}
