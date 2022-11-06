package com.company.day6;

public class Loop1 {
    public static void main(String[] args) {
        int sum = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        for (int i = 1; i <= 10; i++) {
            // if(i%2==0){
            sum = sum+1;
            System.out.println(sum);
            // }

        }

    }
}

