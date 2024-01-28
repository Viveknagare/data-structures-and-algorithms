import java.util.*;

public class Climbing_stairs {

    public static int memoi_ways(int n,int[]dp){   //o(n)
        //base case
        if(n==0)return 1;
        if(n<0)return 0;

        //checking dp array
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=memoi_ways(n-1,dp)+memoi_ways(n-2,dp);
        return dp[n];
    }
    public static int ways(int n){     //o(2^n)
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return ways(n-1)+ways(n-2);
    }

    public static int tabu_ways(int n){     //o(n)
        int[]dp=new int[n+1];
        dp[0]=1;

        //tabulation loop
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("the number of ways to climb is "+ways(n));
        System.out.println("the number of ways to climb is "+memoi_ways(n,dp));
        System.out.println("the number of ways to climb is "+tabu_ways(n));
    }
}
