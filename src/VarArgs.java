import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,46,55,8,6);
    }
    public static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
