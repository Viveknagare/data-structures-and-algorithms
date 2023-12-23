import  java.util.*;
public class Dequeue_Implementation {
    public static void main(String[] args) {
        Deque<Integer>d=new ArrayDeque<>();
        String str="";
        int[]arr=new int[4];
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        System.out.println(d);

        //stack implementation
        Deque<Integer>d1=new ArrayDeque<>();
        for(int i=1;i<=4;i++){
            d1.addLast(i);
        }
        System.out.println(d1);
        System.out.println("the deleted item from stack is "+d1.removeLast());

        //queue implementation using queue
        Deque<Integer>d2=new ArrayDeque<>();
        for(int i=1;i<=4;i++){
            d2.addLast(i);
        }

        System.out.println("deleted element from the queue is "+d2.removeFirst());



    }
}
