public class scope {
    public static void main(String[] args) {
/*        scope  -> where we access our variables
          block scoping ->

 */
        int a = 5;
        int b = 54;
        String name = "ankit";

        {
//            int a = 9; -> already initialized outside the block in the same
            a = 4; // reassign the origin ref variable to some other value.
            System.out.println(a);
            name = "ANKIT";
            int c= 6;
            System.out.println(name);
        }
        int c = 7;
        System.out.println(c);
//        a = 8;
//        int a = 6;
        System.out.println(name);
        System.out.println(a);

        // Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            a = 4400;

        }

    }
}
