package com.company.day4;  //Assignment - Calculator

public class Calculator {
    public static void main(String[] args) {

        int addition = sumOfNumber(10,20);
        int subtraction = differenceOfNumbers(2,6);
        double multiply = multiplyNumbers(3.44, 24.61);
        double divide = divisionOfNumbers(7867,88);

        System.out.println("Sum of Numbers:" +addition);
        System.out.println("Subtraction of Numbers:" +subtraction);
        System.out.println("Multiplication of Numbers:" +multiply);
        System.out.println("Division of Numbers:" +divide);
    }
    public static int sumOfNumber(int s1, int s2){
        return s1+s2;
    }
    public static int differenceOfNumbers(int d1, int d2){
        return d1-d2;
    }
    public static double multiplyNumbers(double m1, double m2){
        return m1*m2;
    }
    public static double divisionOfNumbers(int a, int b){
        return a/b;
    }
}
