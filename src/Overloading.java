public class Overloading {
    public static void main(String[] args) {
//        fun(1, 3);
//        fun(1, "Name");
        int ans = sum(1,2) ;
        System.out.println(ans);

    }

    static void fun(int a, int b) {
        System.out.println("First One");
        System.out.println(a);
        System.out.println(b);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static void fun(int c, String v) {
        System.out.println("Second One");
        System.out.println(c);
        System.out.println(v);
    }

}
