import java.util.*;

public class queue_usingStack {

    static Stack<Integer>s1=new Stack<>();
    static Stack<Integer>s2=new Stack<>();
    public static void enqueue(int data){
        s1.push(data);
    }
    public static int dequeue(){
        int ele;
        if(s1.empty() && s2.empty()){
            System.out.println("stack is empty");
            System.exit(0);
        }

        if(s2.isEmpty()){
            while(!s1.empty()){
                ele=s1.pop();
                s2.push(ele);
            }
        }

        ele=s2.pop();
        return ele;
    }
    public static void main(String[] args) {

        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);


        int x=dequeue();
        System.out.println("topmost element of the stack is "+x);
        x=dequeue();
        System.out.println("topmost element of the stack is "+x);

    }
}
