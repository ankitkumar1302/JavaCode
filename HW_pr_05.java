import java.util.*;

public class HW_pr_05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the and get all the Even number till it. : ");

        int a = sc.nextInt();
        
        System.out.println("Even Nmuber From 1 to " + a + " are : ");

        for(int i=1;i<=a;i++){

            if (i%2==0){

                System.out.println(i + " ");

            }

        }

    }

}
// import java.util.Scanner;

// public class HW_pr_05 {
    
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         // Take input from user.
//         System.out.print("Print all even numbers till : ");
//         int n = scanner.nextInt();

//         System.out.println("\nEven numbers from 1 to " + n + " are : ");

//         for(int i = 1; i <= n; i++) {

//             // Check for even or not.
//             if((i % 2) == 0) {

//                 System.out.print(i + " ");

//             }
//         }
//     }

// }
