import java.util.Scanner;
import java.util.*;
public class HW_pr_07 {
    public static void main(String[] args) {
        // System.out.println("Enter 1 to Enter & 0 to Exit : ");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        int input;
        do{
            int marks = sc.nextInt();
            if(marks >=90 && marks <= 100){
                System.out.println("This is good");
            }else if(marks >= 60 && marks <= 89){
                System.out.println("This is also good");
            }else if(marks >= 0 && marks <= 59){
                System.out.println("This is Good as well");
            } else {
            System.out.println("Invalid");
        }
        System.out.println("Want to Continue ? (Yes(1) or no(0)");
        input = sc.nextInt();

        }while(input==1);
    }
}