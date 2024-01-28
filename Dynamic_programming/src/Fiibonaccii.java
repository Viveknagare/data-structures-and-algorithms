import java.util.*;
public class Fiibonaccii {
    public static int tabulation(int n){
        int[]dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
    public static int fib(int n,int []dp){ //using memoization
        if(n==1 || n==0){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
    public static void main(String[] args) {
        int n=6;
        int dp[]=new int[n+1]; //as in fibonaccii we calculate its value from 0 to n
        System.out.println(fib(n,dp));
        System.out.println(tabulation(n));
    }
}
