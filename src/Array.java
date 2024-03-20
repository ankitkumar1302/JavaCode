import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sindex = 0;
        System.out.println("How many elements you want to enter");
        int n = sc.nextInt();
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (true) {
            System.out.println("Which you want to search? ");
            int search = sc.nextInt();
            if (search == -1) {
                break;
            }
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == search) {
                    sindex = i + 1;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index " + sindex);
            }
        }
    }
}