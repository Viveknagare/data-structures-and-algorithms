import java.util.*;

public class min_subset_sum_diff {
    public static int partitionSum(int[]arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        int W=sum/2;
        int[][]dp=new int[n+1][W+1];

        //initialization
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int val=arr[i-1];
                if(val<=j){
                    //include
                    int ans1=val+dp[i-1][j-val];
                    //exclude
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1,ans2);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int sum1=dp[n][W];
        int sum2=sum-sum1;

        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) {
        int []arr={1,6,11,5};
        System.out.println("the minimum sum between two subsets is "+partitionSum(arr));
    }
}
