import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 5, 46, 55, 8, 6);
        multiple(1, 3, "Ankit", "name");
    }



    static void multiple(int a, int b, String... v) {

    }

    public static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
