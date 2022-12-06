package collectionsFramework.listImplementation;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // add the element to the stack
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        System.out.println(stack.empty());
        System.out.println(stack.size());
        System.out.println(stack);

        // peek method will check who's on the top. it don't delete the element.
        System.out.println("Who is on the top :"+stack.peek());

        // to remove the element from top
        stack.remove(3);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop());
      //  System.out.println(stack.pop());
       // System.out.println(stack.pop()); if we try to delete the empty stack, we get StackEmptyException.
        System.out.println(stack);

    }
}
