public class Subset_Sum_Equal_K {
        public static boolean function(int ind, int target, int[]arr, int[][]dp){
            if(target == 0){
                return true;
            }
            if(ind == 0){
                return arr[0] == target;
            }
    
            boolean nottake = function(ind - 1, target, arr, dp);
            boolean take = false;
            if(target >= arr[ind]){
                take = function(ind - 1, target - arr[ind], arr, dp);
            }
            return take || nottake;
        }
        public static boolean subsetSumToK(int n, int k, int arr[]){
            // Write your code here.
            int[][]dp = new int[n][k + 1];
            return function(n - 1, k, arr, dp);
        }
        public static void main(String[] args) {
            int[]arr = {1,2,3,4};
            int n = 4;
            int k = 4;
            System.out.println(subsetSumToK(n, k, arr));
        }
    }
    