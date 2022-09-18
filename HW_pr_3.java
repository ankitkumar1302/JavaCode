import java.util.*;
public class HW_pr_3 {
    public static void main(String args[]){

        System.out.println("Enter the 1st Value");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the 2st Value");
        int b = sc.nextInt();
         
        System.out.println("Enter the Number You Want to Operate :");
        System.out.println("1: Addition");
        System.out.println("2: Substraction");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Modulas / Remainder");

        Scanner button = new Scanner(System.in);
        int Button = button.nextInt();

        switch(Button){
            case 1: System.out.print("Add = ");
            System.out.println(a+b);
            break;
            case 2:System.out.print("Sub = ");
            System.out.println(a-b);
            break;
            case 3:System.out.print("Multiply = ");
            System.out.println(a*b);
            case 4:System.out.print("Divide = ");
            System.out.print(a/b);
            break;
            case 5 : System.out.print("Modols = ");
            System.out.println(a%b);
            break;
        }
    }

}
