import java.util.Scanner;

public class Example2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 0;
        int col = 0;

        int[][] arr = new int[10][10];
        int[][] arr2 = new int[10][10];
        int[][] result = new int[10][10];
        do {
            System.out.println("Enter the number of rows (max:10) ");
            rows = sc.nextInt();
            if (rows > 10) {
                System.out.println("Error:Number of rows is invalid");
            }
        } while (rows > 10);
        do {
            System.out.println("Enter the number of columns (max:10) ");
            col = sc.nextInt();
            if (col > 10) {
                System.out.println("Error: the number of column is invalid");
            }
        } while (col > 10);
        System.out.println("Enter Code.Array number 1: ");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < col; j++) {
                System.out.println("Enter the elements " + i + j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Code.Array number 2: ");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < col; j++) {
                System.out.println("Enter the elements " + i + j);
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Code.Array is :");
        System.out.println("Code.Array 1    Array2   Result");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("  ");
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("  ");
            for (int j = 0; j < col; j++) {
                result[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
