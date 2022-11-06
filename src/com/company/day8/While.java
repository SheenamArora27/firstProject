package com.company.day8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        //number guessing
        int thoughtNo = (int)(Math.random()*10);
        //System.out.println("Number is "+ thoughtNo);
        System.out.println("lets play guessing game");
        System.out.println("I have thought a number . . try gruessing it ");

        Scanner sc = new Scanner(System.in);

        while(true){
            int guessedNo = sc.nextInt();
            if (thoughtNo == guessedNo){
                System.out.println("you guessed right .. you win");
                break;
            }else{
                System.out.println("you were wrong .. try guessing again");
            }
        }



        System.out.println("new feature");
    }
}
