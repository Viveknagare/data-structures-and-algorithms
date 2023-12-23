//Q5. Given a positive integer num, return true if num is a perfect square or false otherwise.
//        A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer
//        with itself.
//        Example 1:
//        Input: num = 16
//        Output: true
//        Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
//        Example 2:
//        Input: num = 14
//        Output: false
//        Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

import  java.util.*;


public class assignment10 {

    public static boolean perfectsquare(int n){
        int low=0;
        int high=n/2;

        while(low<=high){

            int mid=low+(high-low)/2;
            int x=mid*mid;
            if(n==1){
                return true;//as one is always a perfect square
            }
            if(x==n){
                return true; //if the multiplication of mid*mid and the no n found then perfect square exist
            }else if (x>n){//mid*mid is greater than the required perfect square then no is present in left array of mid
                high=mid-1;
            }else{
                low=mid+1;//mid*mid is smaller than the required perfect square then no is present in right array of mid
            }

        }
        return false;//if the loop over and element not found then not a perfect square
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean res=perfectsquare(n);
        System.out.println("the number is a perfect square "+res);
    }
}
