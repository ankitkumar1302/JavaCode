import java.util.*;
public class Area_Rectangle_by_Method {
   
    public static int printArea(int l, int b){
        System.out.println("The Area of The rectangle is : " + l*b);
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lenght: ");
        int l = sc.nextInt();
        System.out.println("Enter THe bredth: ");
        int b = sc.nextInt();
        printArea(l, b);       
    }
}
