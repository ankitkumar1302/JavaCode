import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
//        add();
//        int sum = add2();
//        System.out.println("The sum is : " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String naam = sc.next();
        String person = hello(naam);
        System.out.println(person);

    }

    static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNo = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNo = sc.nextInt();
        int sum = firstNo + secondNo;
        System.out.println("The sum is :" + sum);
    }

    static int add2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNo = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNo = sc.nextInt();
        int sum = firstNo + secondNo;
//        System.out.println("The sum is :" + sum);
        return sum;
    }

    static String hello(String name) {

        return "Hello " + name;
    }
}
/*
Static :- Does not depend on static
TODO:  write
 */