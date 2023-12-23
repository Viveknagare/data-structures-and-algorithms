import java.util.*;

public class Fibonacci {

    public static int fibonaccifind(int n){
        int result=0;
        if(n<=1){//base case
            result=n;
        }else{
            result=fibonaccifind(n-1)+fibonaccifind(n-2);//recursive call
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number in fibonacci series");
        int n=sc.nextInt();
        //function calling
        int res=fibonaccifind( n);
        System.out.println("the final output is "+res);

    }
}
