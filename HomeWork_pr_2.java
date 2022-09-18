import java.util.*;
public class HomeWork_pr_2 {
    private static Scanner sc;

    public static void main(String[] args){
        System.out.println("Enter the Radius");
        sc = new Scanner(System.in);
        int r = sc.nextInt();
        float area = 2*3.14F*r;
        System.out.println("The area of Circle is :");
        System.out.println(area);
    }
}
