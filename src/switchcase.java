import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        if(fruit.equals("mango")){
//            System.out.println("King");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("A sweet fruit");
//        }
//        switch (fruit) {
//            case "Mango" -> System.out.println("King");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Grapes" -> System.out.println("Small fruits");
//            default -> throw new IllegalStateException("Unexpected value: " + fruit);
//        }

        int days = in.nextInt();
        switch (days) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
