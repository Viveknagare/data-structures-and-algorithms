import java.util.*;

public class Coins_change {

    public static void print(int[][]dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++ ){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int coin_change(int []coins,int sum){
        int n=coins.length;
        int[][]dp=new int[n+1][sum+1];
        for(int i=0;i<dp.length;i++) {
            dp[i][0]=1;
        }
        for(int j=0;j<dp[0].length;j++ ){
            dp[0][j]=0;
        }

        for(int i=1;i<dp.length;i++ ){
            for(int j=1;j<dp[0].length;j++){
                if(coins[i-1]<=j){
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[]coins={1,2,3,4};
        int sum=10;
        System.out.println("the number of ways are "+coin_change(coins,sum));

    }
}
