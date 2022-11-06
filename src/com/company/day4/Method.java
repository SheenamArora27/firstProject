package com.company.day4;

public class Method {

    public static void main(String[] args) {
       /* System.out.println("hi");
        jump5Times();
        System.out.println("bye"); */
        // sum();   //calling static method
        int result = sumOfNumbers(2, 4);
        System.out.println(result);

        int num = 12123123;

    }
    /*
    public static void jump5Times(){
        System.out.println("jump 5 times");
        jump10Times();
        System.out.println("random");
    }
    public static void jump10Times(){

        System.out.println("jump 10 times");
    }
    public static int doubleANumber(int n){
        return n*2;
    }
    */
    public static int extractLastNumber(int num){
        return num;

    }
    public static int sumOfNumbers(int a, int b){
        return a+b;
    }
    //public static int findOutMagicalAge(){}
    // public static void sum(){}
}
