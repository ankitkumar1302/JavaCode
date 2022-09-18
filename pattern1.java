// import java.util.*;
// public class pattern1 {
//     public static void main(String args[]) {
//         int n = 5;
//         int m = 4;
//         for (int i = 0;i<n;i++){
//             for (int j = 0;j<m;j++){
//                 System.out.print("*");
//             }

//             System.out.println();       
//         } 
//     }
// }

import java.util.*;
public class pattern1 {
    public static void main(String args[]){
        int n = 4;
        for(int i = 1; i <= 4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}