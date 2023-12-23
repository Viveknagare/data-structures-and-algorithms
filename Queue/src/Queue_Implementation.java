import java.util.*;
public class Queue_Implementation {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        System.out.println("queue data is "+q);
        System.out.println("topmost element of the queue is "+q.peek());
        System.out.println(q.remove());
        System.out.println("top most element of the queue is "+q.peek());
        System.out.println("size of the queue is "+q.size());
    }
}
