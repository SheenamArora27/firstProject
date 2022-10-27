package com.company.day5;

public class day5 {
    public static void main(String[] args) {

        int x = 99;

        if(x<10)
        {
            System.out.println("It is a lucky number");
        }
        else{
            System.out.println("It is bad number");
        }

        ///----LOGICAL OPERATOR------------
        int age = 12;
        if(age>=10 && age<=20){   //and
            System.out.println("Allowed to take the ride");
        }

        int month = 3;
        if (month == 1 || month == 3 || month == 5){  //or
            System.out.println("31 days");
        }


    }
}
