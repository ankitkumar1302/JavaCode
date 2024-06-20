package Assignment;

import java.util.Scanner;

public class ConditionalsLoops {

    /*
      1) Area Of Circle Java Program
      2) Area Of Triangle
      3) Area Of Rectangle Program
      4) Area Of Isosceles Triangle
      5) Area Of Parallelogram
      6) Area Of Rhombus // (d1*d2)/2
      7) Area Of Equilateral Triangle // (Math.sqrt(3)/4)*Math.pow(side,2)
      8) Perimeter Of Circle
      9) Perimeter Of Equilateral Triangle
      10) Perimeter Of Parallelogram
      11) Perimeter Of Rectangle
      12) Perimeter Of Square
      13) Perimeter Of Rhombus
      14) Volume Of Cone Java Program
      15) Volume Of Prism
      16) Volume Of Cylinder
      17) Volume Of Sphere
      18) Volume Of Pyramid
      19) Curved Surface Area Of Cylinder
      20) Total Surface Area Of Cube
      21) Fibonacci Series In Java Programs
      22) Subtract the Product and Sum of Digits of an Integer
      23) Input a number and print all the factors of that number (use loops).
      24)Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
      25)Take integer inputs till the user enters 0 and print the largest number from all.
      26)Addition Of Two Numbers

        ### Intermediate Java Programs
    1. Factorial Program In Java (done)
    2. Calculate Electricity Bill
    3. Calculate Average Of N Numbers
    4. Calculate Discount Of Product
    5. Calculate Distance Between Two Points
    6. Calculate Commission Percentage // the divisor is totalAmount
    7. Power In Java
    8. Calculate Depreciation of Value
    9. Calculate Batting Average
    10. Calculate CGPA Java Program // CGPA = Total Grade Points Earned / Total Credit Hours
    11. Compound Interest Java Program
    12. Calculate Average Marks
    13. Sum Of N Numbers
    14. Armstrong Number In Java
    15. Find Ncr & Npr
    16. Reverse A String In Java
    17. Find if a number is palindrome or not
    18. Future Investment Value
    19. HCF Of Two Numbers Program
    20. LCM Of Two Numbers
    21. Java Program Vowel Or Consonant
    22. Perfect Number In Java
    23. Check Leap Year Or Not
    24. Sum Of A Digits Of Number
    25. Kunal is allowed to go out with his friends only on the even days of a given month.
        Write a program to count the number of days he can go out in the month of August.
    26. Write a program to print the sum of negative numbers,
        sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
        The list terminates when the user enters a zero.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }







  /*

      static int sumOfDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num %10;
            num /= 10;
        }
        return sum;
    }



      public static boolean isLeapYear(int year) {

//        Define a function isLeapYear that takes an integer year as a parameter.
//        Inside the function, use an if-else statement to check if the year is divisible by 4.
//        If the year is divisible by 4, check if it's also divisible by 100. If it is, then it must also be divisible by 400 to be a leap year.
//        If the year is not divisible by 100, then it's a leap year.
//        If the year is not divisible by 4, then it's not a leap year.

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

  static boolean isPerfectNumber(int num) {
        //main
        System.out.println(isPerfectNumber(6)); // divisor are 1,2,3 the sum is 6.
        //over
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

 static boolean isVowel(char c) {
 // main
  char c = sc.next().charAt(0);
        System.out.println(isVowel(c));

 //over

        c = Character.toLowerCase(c);
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };

    }
     static int calculateLCM(int num1,int num2){
     int product = num1* num2;
     int hcf = calculateHCF(num1,num2);
     int lcm = product / hcf;
        return lcm;
    }

    private static int calculateHCF(int num1,int num2) {
        while (num2 != 0){
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }

   static int calculateHCF(int num1, int num2) {

        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }


  static double calculateFutureInvestment(double principle, double annualInterestRate, int timesInterestCompoundPerYear, int years) {
        // main

        System.out.println(calculateFutureInvestment(10000, 5, 4, 5));

        //over

        double rate = annualInterestRate / 100;
        return principle * Math.pow((1 + rate / timesInterestCompoundPerYear), timesInterestCompoundPerYear * years);

    }

   static boolean isPalindrome(int number){

        //main
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(132465978));
        //over

        String original = Integer.toString(number);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }


 static String revString(String str){

        //main
        String str = "Ankit";
        String reversed =  revString(str);
        System.out.println(reversed);
        //over

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }


static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    static int nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static boolean armstrongNumber(int num) {

        // main

        System.out.println("Enter the number :");
        int isArmstrong = sc.nextInt();
        System.out.println("The number is "+armstrongNumber(isArmstrong));

        //over

        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = num;

        for (; originalNumber != 0; originalNumber /= 10, ++n) {
        }
        originalNumber = num;
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if (result == num)
            return true;
        else
            return false;

    }

    public static int sumOfNNumbers(int[] arr) {

        // main
        System.out.println("How many numbers you want to Enter :");
        int numbers = sc.nextInt();
        int[] arr = new int[numbers];
        System.out.println("Enter the numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of the Numbers is :" + sumOfNNumbers(arr));

        //over

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


 public static float calculateAverageMarks(float[] marks) {
        // main
        System.out.println("How many subjects you have :");
        int subjects = sc.nextInt();
        float[] marks = new float[subjects];
        System.out.println("Enter the marks :");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextFloat();
        }
        System.out.println("The average of you marks is : " + calculateAverageMarks(marks));
        //over
        float sum = 0.0f;
        float average = 0.0f;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        average = sum / marks.length;
        return average;
    }

  public static double calculateCompoundInterest(double principle, double rate, double timePerYear, double years) {

        // main
        System.out.println("Enter the Principle Amount :");
        double principle = sc.nextDouble();
        System.out.println("Enter the rate (For example -> 0.05 is 5% rate):");
        double rate = sc.nextDouble();
        System.out.println("Enter time per year :");
        int timePerYear = sc.nextInt();
        System.out.println("Enter the years :");
        int years = sc.nextInt();
        System.out.println("The compound Interest is :" + calculateCompoundInterest(principle, rate, timePerYear, years));


        //over

        return principle * Math.pow((1 + rate / timePerYear), timePerYear * years);
    }

   public static float calculateCGPA(int[] creditHours, float[] gradePoints) {

        // Main

        System.out.println("How many hours allotted for you to study :");
        int size = sc.nextInt();
        int[] creditHours = new int[size];
        System.out.println("Enter your credit (For example 1,2,3) :");
        for (int i = 0; i < creditHours.length; i++) {
            creditHours[i] = sc.nextInt();
        }
        System.out.println("Enter you Grade Points (For example 4.0 ,4 ,5.5) :");
        float[] gradePoint = new float[size];
        for (int i = 0; i < gradePoint.length; i++) {
            gradePoint[i] = sc.nextFloat();
        }
        float cgpa = calculateCGPA(creditHours, gradePoint);
        System.out.println("The cgpa is " + cgpa);

        // Over



        if (creditHours.length != gradePoints.length) {
            throw new IllegalArgumentException("The numbers you have entered must be correct");
        }
        int totalCreditHours = 0;
        float totalGradePoints = 0.0f;

        for (int i = 0; i < creditHours.length; i++) {
            totalCreditHours += creditHours[i];
            totalGradePoints += gradePoints[i] * creditHours[i];
        }
        return totalGradePoints / totalCreditHours;

    }


        public static int battingAverage(int totalRunScored, int numberOfTimeOut) {

        //main

        System.out.println("Enter how much run he scored :");
        int runScored = sc.nextInt();
        System.out.println("Enter how much times he/she Out :");
        int timesOut = sc.nextInt();
        System.out.println("The Batting average is :" + battingAverage(runScored, timesOut));

        //over

        return totalRunScored / numberOfTimeOut;
    }



      public static double depreciationOfValue(double initialValue,double rateOfDeprecation,int noOfYears){

        // Main

        System.out.println("Enter the initial value of the product :");
        double initialValue = sc.nextDouble();
        System.out.println("Enter the rate of deprecation :");
        double rateOfDeprecation = sc.nextDouble();
        System.out.println("Enter the number of years :");
        int noOfYears = sc.nextInt();
        System.out.println("The Deprecated value of your product is :"+depreciationOfValue(initialValue,rateOfDeprecation,noOfYears));


        //Over

        return initialValue * Math.pow((1-rateOfDeprecation),noOfYears);
    }


    public static double powerInJava(double base,double expo){
        //main
      System.out.println("Enter the base: ");
      double base = sc.nextDouble();
      System.out.println("Enter the exponent/power");
      double expo = sc.nextDouble();
      System.out.println(powerInJava(base,expo));
      //over
        return Math.pow(base, expo);
  }


         public static double commissionPercentage(double totalAmount, double commissionAmount) {
        // main
        System.out.println("Enter the Total amount :");
        double totalAmount = sc.nextDouble();
        System.out.println("Enter the Commission amount :");
        double commissionAmount = sc.nextDouble();
        System.out.println("The Commission Percentage is: " + commissionPercentage(totalAmount, commissionAmount));
        //over

        return (commissionAmount / totalAmount) * 100;
    }


       public static double calculateDistanceBwtTwoPoints(double x1, double x2, double y1, double y2) {

        // main
        System.out.println("Enter the 1st coordinate of X:");
        double coordinate_1_Of_X = sc.nextDouble();
        System.out.println("Enter the 2nd coordinate of X :");
        double coordinate_2_OfX = sc.nextDouble();
        System.out.println("Enter the 1st coordinate of Y :");
        double coordinate_1_Of_Y = sc.nextDouble();
        System.out.println("Enter the 2nd coordinate of Y :");
        double coordinate_2_Of_Y = sc.nextDouble();
        System.out.println("The distance that you covered is " + calculateDistanceBwtTwoPoints(coordinate_1_Of_X, coordinate_2_OfX, coordinate_1_Of_Y, coordinate_2_Of_Y));
// over

        return Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));
    }


   public static float calculateDistance(float dist1, float dist2) {

     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Distance");
        float distanceFirst = sc.nextFloat();
        System.out.println("Enter the Second Distance");
        float distanceSecond = sc.nextFloat();
        System.out.println("The final distance is :" + calculateDistance(distanceFirst, distanceSecond));

        if (dist1 > dist2) {
            return dist1 - dist2;
        }
    return 0;
    }


    public static double calculateDiscount(double originalPrice, float discountRate) {


        //        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the price:");
//        double price = sc.nextDouble();
//        System.out.println("Enter the discount rate:");
//        float discount = sc.nextFloat();
//        System.out.println("The discount is "+calculateDiscount(price,discount));


        double discountPrice = originalPrice * discountRate / 100;

        return originalPrice - discountPrice;
    }

    public static double calculateDiscount(double originalPrice, double discountRate) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product price: ");
        double price = sc.nextDouble();
        System.out.println("Enter the discount rate: ");
        double discount = sc.nextDouble();
        System.out.println(calculateDiscount(price,discount));

        double discountAmount = originalPrice * discountRate / 100;
        double finalPrice = originalPrice - discountAmount;
        return finalPrice;
}


   public static double avgOfNumber(double[] arr) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many item you want to enter: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value :");
            arr[i] = sc.nextDouble();
        }
        double avg = avgOfNumber(arr);
        System.out.println("The average is -> " + avg);

        double sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = arr[i];
        }
        return (double) sum / n;
    }



        start 50 unit -> 3.5rs
        after these unit 250 -> 6.5rs
        after these unit upto 301 -> 7rs


    public static double calculate_Bill(int units)
    {

        Scanner sc = new Scanner(System.in);
        //System.out.println(bill());
        System.out.println("Enter your Electricity (Unit)-> ");
        int unit = sc.nextInt();
        double bill= calculate_Bill(unit);
        System.out.println(" Bill Value ->"+bill);
        double bill=0;
        if(units <=50)
        {
            bill=units*3.50;
        }
        else if( units<=250)
        {
            bill=50*3.50 + (units-50)*6.50;
        }
        else
        {
            bill=50*3.50 + 200*6.50 + (units-250)*7;
        }
       return  bill;
    }

  public static int printNo(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            return printNo(n - 1);
        }
    }

  public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }


  static void add() {
        int first;
        int second;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value:");
        first = sc.nextInt();
        System.out.println("Enter the second value:");
        second = sc.nextInt();
        System.out.println("The sum of the given number is:");
        sum = first + second;
        System.out.println(sum);
    }

 public static void largest() {
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter numbers (0 to stop):");
        while ((num = scanner.nextInt()) != 0) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number: " + max);
    }
    static void sumOfAll() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter numbers (0 to stop):");
        while ((num = scanner.nextInt()) != 0) {
            sum += num;
        }
        System.out.println("Sum of all the numbers: " + sum);
    }


     static void factorOfNumber(int n) {
        // Print all the factor of that number.
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ",");
            }
        }
    }


    static public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int d = n%10;
            product = product*d;
            sum = sum+d;
            n = n/10;
        }
        return product - sum;
    }

    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int sum;
        System.out.println("The numbers you entered "+ n);
        System.out.println("First " + n + " terms: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(a +",");
            sum = a+b;
            a = b;
            b = sum;
        }
    }

static int tsaCube(int a){
        return 6*a;
}

    static double csaCylinder(double r, double h) {
        return 2 * Math.PI * r * h;
    }

    static float volPyramid(float l,float w,float h){
        return (l*w*h)/3;
    }

static double volSphere(double r){
    return 4.0/3.0*Math.PI*Math.pow(r,3);
}

static double volCy(double r,double h){
        return Math.PI*Math.pow(r,2)*h;
}


static int volPrism(int l,int b){
        return l*b;
}

static double volCone(double r ,double h){
        return (1.0/3.0)*Math.PI*Math.pow(r,2)*h;
}

static int periRhombus(int a){
        return 4*a;
}

    static int periSq(int a){
        return a*4;
    }

    static int rectPeri(int l,int b){
        return 2*(l+b);
    }

static int parallelogramPari(int l,int b){
        return 2*(l+b);
}

 static double EquilateralTriangle(double side){
        return (Math.sqrt(3)/4* Math.pow(side,2));
 }
static int rhombus(int d1,int d2){
        return (d1*d2)/2;
}
static int question5(int base,int h){
        return base*h;
}

    static int question4(int l,int i) {
      return l*2*i;
    }
  static int question3(int l,int b){
      return l*b;
  }


static int question2(int sides_in_cm){
      return sides_in_cm*3;
  }

    static float question1(int r){
        float pi = 3.14F;
        return 2*pi*r;
    }

   */

}