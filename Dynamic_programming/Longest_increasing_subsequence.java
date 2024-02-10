
import java.util.*;
class Solution {
    public static int LIS(int[]nums,int[]arr){
        int m=nums.length;
        int n=arr.length;

        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        


        //tabulation code
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(nums[i-1]==arr[j-1]){

                    dp[i][j]=1+dp[i-1][j-1];


                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }

        return dp[m][n];
    }
    public static int lengthOfLIS(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int []arr=new int[set.size()];
        int i=0;
        for(int num:set){
            arr[i++]=num;
        }
        Arrays.sort(arr);
        return LIS(nums,arr);
    }

    public static void main(String[] args) {
        int nums[]={50,3,10,7,40,80};
        System.out.println("the longest increasing subsequence is "+lengthOfLIS(nums));
    }
}