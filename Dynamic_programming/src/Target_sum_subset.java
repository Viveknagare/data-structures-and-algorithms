import java.util.*;
//o(n*w)
public class Target_sum_subset {
    public static boolean targetsum(int []arr,int sum){
        int n=arr.length;
        boolean[][]dp=new boolean[n+1][sum+1];


        for(int i=0;i<dp.length;i++) {
            dp[i][0]=true;
        }

        //i matlab items and j matlab target sum
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++) {
                int val=arr[i-1];
                if(val<=j && dp[i-1][j-val]==true){
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }

                 //the above conditions can also be written as following but in above code we merged the exclude conditions
//                if(val<=j){
//                    if(dp[i-1][j-val]==true){
//                        dp[i][j]=true;
//                    }else if(dp[i-1][j]==true){
//                        dp[i][j]=true;
//                    }
//                }else if(dp[i-1][j]==true){
//                    dp[i][j]=true;
//                }
            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void print(boolean [][]dp){
        for(int i=0;i<dp.length;i++ ){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={4,2,7,1,3};
        int sum=10;
        System.out.println(targetsum(arr,sum));
    }
}
