package unit3;

import java.util.Stack;

public class MyLifo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int a = stack.pop();

        System.out.println(a + ":" + stack);

        int b = stack.peek();

        System.out.println(b + ":" + stack);

        stack.remove(1);

        System.out.println(stack);

        stack.clear();

        System.out.println(stack);


    }
}
