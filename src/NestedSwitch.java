import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Ankit");
            case 2 -> System.out.println("kumar");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Invalid input" + department);
                        break;
                }
            }
            default -> System.out.println("Enter Correct EmpID");
        }
    }
}
