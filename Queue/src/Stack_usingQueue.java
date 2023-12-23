import java.util.*;
public class Stack_usingQueue {

    Queue<Integer> q1=new LinkedList<>() ;
    Queue<Integer>q2=new LinkedList<>();

    public void push(int data){
        while(!q1.isEmpty()){
            q2.add(q1.peek());//here instead of doing peek and then deletiing by poll you can use remove function
            q1.poll();

        }

        q1.add(data);

        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    public int pop(){
        if(q1.isEmpty()){
            System.out.println("no element in the queue");
            System.exit(0);
        }
        int ele=q1.peek();
        q1.poll();

        return ele;
    }

    public static void main(String[] args) {
        Stack_usingQueue s1=new Stack_usingQueue();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(6);

        System.out.println("the topmost element is "+s1.pop());
    }
}
