package Day1.day2;
import java.util.*;

public class stack {
    // Online Java Compiler
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(9);
        stack.pop();
        stack.push(19);
        stack.pop();
        stack.push(16);
        stack.pop();
        System.out.println(stack.pop());
    }
}
