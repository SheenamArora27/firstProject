package com.company.day8;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        int thoughtNumber = (int) (Math.random() * 10);
        System.out.println("lets play guessing game");
        System.out.println("I have thought a number . . try gruessing it ");

        Scanner sc = new Scanner(System.in);
        int guessNo = sc.nextInt();


        while (thoughtNumber!=guessNo) {      //while( i<=10)  ///    while(true)
            System.out.println("your guess was wrong .. try again");
            guessNo = sc.nextInt();    //i++
            break;
        }
        System.out.println("you win");  //i=1
    }

}

