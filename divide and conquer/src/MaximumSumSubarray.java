import java.util.*;

public class MaximumSumSubarray {
    public static int maxCrossingSum(int []arr,int mid,int low,int high){
        int sum=0;
        int leftsum=Integer.MIN_VALUE;
        for(int i=mid;i>low;i--){
            sum+=arr[i];
            if(sum>leftsum){
                leftsum=sum;
            }
        }
        sum=0;
        int rightsum=Integer.MIN_VALUE;
        for(int i=mid;i<high;i++){
            sum+=arr[i];
            if(sum>rightsum){
                rightsum=sum;
            }
        }

        return Math.max(Math.max(rightsum,leftsum),rightsum+leftsum-arr[mid]);
    }
    public static int maxSumSubarray(int []arr,int low,int high){
        if(low>high)return Integer.MIN_VALUE;
        if(low==high)return arr[low];

        int mid=(low+high)/2;
        return Math.max(Math.max(maxSumSubarray(arr,low,mid-1),
                maxSumSubarray(arr,mid+1,high)),
                maxCrossingSum(arr,mid,low,high));
    }
    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        System.out.println("the maximum subarray sum is "+maxSumSubarray(arr,0,n-1) );
    }
}
