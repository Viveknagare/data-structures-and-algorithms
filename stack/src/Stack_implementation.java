import java.util.*;
public class Stack_implementation {
    public static void main(String[] args) {
        Stack<Integer>stack1=new Stack<>();

        //insert elements
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        //print the topmost element
        System.out.println("the topmost element of the stack is "+ stack1.peek());

        //delete the elements of the stack
        stack1.pop();
        System.out.println("the topmost element after deletion is "+stack1.peek());

        //searching in stack
        //search function returns -1 if element is not present in the stack
        System.out.println("the postion of 3 in the stack is "+stack1.search(3));

        //to see whether the stack is empty or not
        System.out.println("the stack is empty "+stack1.empty());
    }
}
