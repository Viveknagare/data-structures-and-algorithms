class Partition_equal_subset_sum {
    public static boolean function(int[] arr, int target, int ind, Boolean[][] dp) {
        if (target == 0) return true;
        if (ind == 0) return arr[0] == target;
        if (dp[ind][target] != null) return dp[ind][target];

        boolean notTake = function(arr, target, ind - 1, dp);
        boolean take = false;
        if (arr[ind] <= target) {
            take = function(arr, target - arr[ind], ind - 1, dp);
        }

        return dp[ind][target] = take || notTake;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return function(nums, target, nums.length - 1, dp);
    }
}