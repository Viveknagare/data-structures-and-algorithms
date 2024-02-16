import java.util.*;

public class Catalan {

    //recursion
    public static int  catalan(int n){

        if(n==0 || n==1)return 1;

        int ans=0;
        for(int i=0;i<n;i++){
            ans+=catalan(i)*catalan(n-i-1);
        }
        return ans;
    }

    //memoization
    public static int catalan_memoi(int n,int[]dp){
        if(n==1 || n==0)return 1;
        //checking if dp contains the value if there then no need to make recursive call direct return from the dp
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        for(int i=0;i<n;i++ ){
            ans+=catalan_memoi(i,dp)*catalan_memoi(n-i-1,dp);
        }
        dp[n]=ans;
        return dp[n];
    }

    //tabulation o(n^2) much better than recursion and memoization
    public static int catalan_tabu(int n){
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }

        return dp[n];

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(catalan(n));
        //recursion code will give stack overflow error for n=30
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(catalan_memoi(n,dp));
        System.out.println(catalan_tabu(n));
    }
}
