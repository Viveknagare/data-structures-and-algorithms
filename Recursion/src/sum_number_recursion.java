//find the sum of the number using recursion

import java.util.*;
public class sum_number_recursion {

    public int sum_number(int x){
        int sum=0;int result=0;
        //base case condition
        if(x==0){
            return 0;
        }else{
            //recursive call
            sum=(x%10)+sum_number(x/10);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();
        sum_number_recursion s1=new sum_number_recursion();
        int result=s1.sum_number(x);
        System.out.println("the sum is "+result);
    }
}
