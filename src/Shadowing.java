public class Shadowing {
    static int x = 20;
    // What is shadowing in JAVA?

    // Shadowing is the process of using two variables with the same name within scopes that overlap.
    // When you declare a variable within a scope, it is this variable that is used within the scope rather than any variable of the same name in outer scopes.
    // In other words, the inner variable shadows the outer variable.
    // The outer variable is said to be shadowed.
    // Shadowing is important as it allows you to avoid confusion in the case where you need to use the same variable name in multiple scopes.
    // Shadowing is also important when working with inheritance, as we will see later in this tutorial.
    // Shadowing is often viewed as a bad practice, as it can make code difficult to read.
    // However, shadowing can be useful when working with inheritance, as we will see later in this tutorial.
    // Shadowing is a concept that is important to understand as it is used in many programming languages.

    public static void fun() {
        System.out.println(x);
        int x; // Deceleration
        x = 10; // Initialization
        System.out.println(x);
    }

    public static void main(String[] args) {
        fun();
    }
}
