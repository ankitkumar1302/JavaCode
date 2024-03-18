package assignment;

import java.util.Scanner;

public class functions {


    /*
    Questions:-
    

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printMax(2,4,5);
        printMin(2,4,7);

    }


    public static void printMax(int num1, int num2, int num3) {
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The maximum number is: " + max);
    }

    public static void printMin(int num1, int num2, int num3) {
        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("The minimum number is: " + min);
    }
}