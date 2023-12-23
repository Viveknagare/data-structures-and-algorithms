//squareroot of a number using binary search. also floor values of non perfect square are taken

import java.util.*;


public class Squareroot {

    public static int squareroot(int num){
        int low=0;
        int high=num;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=mid*mid;
            if(val==num){
                return mid;
            }else if(val<num){
                 result=mid;
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

       int res=squareroot(n);
        System.out.println("square root of the number is "+res);



    }
}
