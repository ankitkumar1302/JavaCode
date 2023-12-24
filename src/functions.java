import java.util.Scanner;

public class functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the input of 2 numbers and print the sum in function
        System.out.println("Enter the first number: ");
        int firstNo = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNo = sc.nextInt();
        System.out.println(add(firstNo, secondNo));
    }

    static int add(int firstNo, int secondNo) {
        return firstNo + secondNo;
    }
}
