package assignment;

import java.util.Scanner;

public class firstjava {

    /*
    Write Java programs for the following:
1) Write a program to print whether a number is even or odd, also take input from the user.
2) Take name as input and print a greeting message for that particular name.
3) Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
4) Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
5) Take 2 numbers as input and print the largest number.
6) Input currency in rupees and output in USD.
7) To calculate Fibonacci Series up to n numbers.
8) To find out whether the given String is Palindrome or not.
9) To find Armstrong Number between two given number.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
//        greet(name);
        System.out.println(greet(name));

    }

    static String greet(String name) {
        return  "Good" + name;

    }


    static void firstQuestion(int a) {
        if (a % 2 == 0) {
            System.out.println("This is an Even Number");
        } else {
            System.out.println("This is a Odd Number");
        }
    }


}