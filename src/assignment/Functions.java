package assignment;


/*
Write a program to print the factorial of a number by defining a method named 'Factorial'.
 Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1

Write a function to find if a number is a palindrome or not. Take number as parameter.

Convert the programs in flow of program, first java, conditionals & loops assignments into functions.

Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

Write a function that returns all prime numbers between two given numbers.

Write a function that returns the sum of first n natural numbers.
 */

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Factorial(num));

    }
    public static int Factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * Factorial(num - 1);
    }
}
/*
    Q4.
       private static String isPrime(int num) {
        if (num == 0) {
            return "Enter the value other than 0";
        }
        if (num % 2 == 0)
            return "Even";

        else
            return "Odd";
    }



    Q3.A person is eligible to vote if his/her age is greater than or equal to 18.
     Define a method to find out if he/she is eligible to vote.

  private static String age(int age) {
        if (age >= 18) {
            return "Your are eligible for vote";
        }
        else
            return "you are not eligible";
    }




   Q2. Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(evenOrOdd(num));

    }

    private static String evenOrOdd(int n) {
        if (n % 2 == 0) return "The Number is Even";
        else
            return "The Number is Odd";
    }

   Q1. Define two methods to print the maximum and
    the minimum number respectively among three
     numbers entered by the user.

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to Enter");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Greatest number is: " + findMax(arr));
        System.out.println("The Least number is: " + findMin(arr));
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

 */