//TABULATION

public class Subset_Sum_Equal_K {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        boolean[][]dp = new boolean[n][k + 1];
        for(int i = 0; i < n; i++){
            dp[i][0] = true;
        }
        if(arr[0] <= k) dp[0][arr[0]] = true;

        for(int ind = 1; ind < n; ind++){
            for(int target = 1; target <= k; target++){
               boolean nottake = dp[ind - 1][target];
               boolean take = false;
               if(target >= arr[ind]){
                   take = dp[ind - 1][target - arr[ind]];
               }
               dp[ind][target] = take || nottake;
            }
        }
        return dp[n - 1][k];
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        int n = 4;
        int k = 4;
        System.out.println(subsetSumToK(n, k, arr));
    }
}








//MEMOIZATION

// public class Subset_Sum_Equal_K {
//         public static boolean function(int ind, int target, int[]arr, int[][]dp){
//             if(target == 0){
//                 return true;
//             }
//             if(ind == 0){
//                 return arr[0] == target;
//             }
    
//             boolean nottake = function(ind - 1, target, arr, dp);
//             boolean take = false;
//             if(target >= arr[ind]){
//                 take = function(ind - 1, target - arr[ind], arr, dp);
//             }
//             return take || nottake;
//         }
//         public static boolean subsetSumToK(int n, int k, int arr[]){
//             // Write your code here.
//             int[][]dp = new int[n][k + 1];
//             return function(n - 1, k, arr, dp);
//         }
//         public static void main(String[] args) {
//             int[]arr = {1,2,3,4};
//             int n = 4;
//             int k = 4;
//             System.out.println(subsetSumToK(n, k, arr));
//         }
//     }
    