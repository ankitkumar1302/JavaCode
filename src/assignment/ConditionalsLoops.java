package assignment;

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
    6. Calculate Commission Percentage
    7. Power In Java
    8. Calculate Depreciation of Value
    9. Calculate Batting Average
    10. Calculate CGPA Java Program
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
//        TODO: Calculate the discount of product.(3)



    }





  /*

    public static double calculateDiscount(double originalPrice, double discountRate) {
        /***
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