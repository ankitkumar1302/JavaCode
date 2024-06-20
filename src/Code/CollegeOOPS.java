import java.util.Scanner;

public class CollegeOOPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        int[] arr2 =new int[n];
        int m=0;
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
        }
        for(int i=0; i<n; i++)
        {
            m=arr[i];
            arr2[m]=i;
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}



