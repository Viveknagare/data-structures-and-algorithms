import java.util.*;

public class Factorial {

    public static int recursion(int n){
        int result=0;
        if(n==1 || n==0){//base condition
            return 1;
        }else{
             result=n*recursion(n-1);//recursive function calling
        }
           return result;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x=sc.nextInt();
        int res=recursion(x);
        System.out.println("the factorial of given number is "+res);
    }
}
