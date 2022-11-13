import java.util.*;

public class stack {

    public static void main(String Args[]) {

        Stack<String> stack = new Stack<String>();
        
        stack.push("Minecraft");
        stack.push("COD");
        stack.push("BGMI");
        stack.push("FFVII");
        stack.push("PUBG");

        String myFavGame = stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search("COD"));

        
        System.out.println(myFavGame);
        System.out.println(stack);

    }
    
}
