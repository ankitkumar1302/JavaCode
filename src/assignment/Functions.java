package assignment;

public class Functions {

    public static void main(String[] args) {



    }





}
/*

    Q3.A person is eligible to vote if his/her age is greater than or equal to 18.
     Define a method to find out if he/she is eligible to vote.




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