package com.company.day6;

public class Day6 {

    static int x= 4;

    public static void main(String[] args) {


    }
    public static void testEvenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
        public static void testPositiveNegative(int x) {
            if(x > 0){
                System.out.println("positive");
            }
            else if(x<0) {
                System.out.println("negative");
            }
            else{
                System.out.println("zero");
            }

        }
}
