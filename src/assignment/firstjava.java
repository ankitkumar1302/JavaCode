package assignment;

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
        boolean ans = eighthQuestion("naman");
        System.out.println(ans);
    }


    static boolean eighthQuestion(String str) {
        int i = 0;
        int j = str.length() - 1; // get the last index
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

/*
    static void seventhQuestion() {
        int t1 = 0;
        int t2 = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("First "+n+" terms: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(t1  + " + ");
//            System.out.print(t1 + t2);
            int sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }
    }

    static void firstQuestion(int a) {
        if (a % 2 == 0) {
            System.out.println("This is an Even Number");
        } else {
            System.out.println("This is a Odd Number");
        }
    }
   // secondQuestion
    static String greet(String name) {
        return  "Good" + name;
    }

    static int thirdQuestion(int a, int b, int c) {
        Scanner P = new Scanner(System.in);
        Scanner R = new Scanner(System.in);
        Scanner T = new Scanner(System.in);
        System.out.println("Enter the Principle: ");
        int p = P.nextInt();
        System.out.println("Enter the Rate: ");
        int r = R.nextInt();
        System.out.println("Enter the Time: ");
        int t = T.nextInt();

        int ans = thirdQuestion(p, r, t);
        System.out.println("The Simple Interest is: " + ans);

        int SimpleInterest = a * b * c;
        return SimpleInterest;

    }




     */
}
