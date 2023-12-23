import java.util.*;
public class Example {


    Example(){
        System.out.println("triggered");

    }

    int sum(int a,int b){
        int c=a*b;
        return c;

    }
    public static void main(String[] args) {
        System.out.println("hello");
        Example e1=new Example();
        e1.sum(2,3);
    }

}
