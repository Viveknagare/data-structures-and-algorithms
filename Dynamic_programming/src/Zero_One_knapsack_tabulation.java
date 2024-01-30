import java.util.*;

public class Zero_One_knapsack_tabulation {

    public static int knapsack_tabu(int W,int[]wt,int[]val){
        int n=val.length;
        int[][]dp=new int[n+1][W+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++) {
            for(int j=1;j<W+1;j++){
                int weight=wt[i-1];
                int value=val[i-1];

                if(weight<=j){                          //here we are taking j instead of W because bag size is changing and in current scenario we have bag of size j .
                    //include
                    int max1=value+dp[i-1][j-weight];     // j because it is the current sack weight
                    //exclude
                    int max2=dp[i-1][j];

                    dp[i][j]=Math.max(max1,max2);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];

    }
    public static void main(String[] args) {
        int[]val={15,14,10,45,30};
        int []wt={2,5,1,3,4};
        int W=7;
        int[][]dp=new int[val.length+1][W+1];
        for(int i=0;i< dp.length;i++) {
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }

        System.out.println(knapsack_tabu(W,wt,val));
    }

}
