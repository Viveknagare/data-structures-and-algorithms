import java.util.*;

public class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[]arr=new int[n-k+1];
        Deque<Integer>d1=new LinkedList<>();
        int x=0;

        for(int i=0;i<nums.length;i++){
            while(!d1.isEmpty() && nums[d1.getLast()]<=nums[i]){
                d1.pollLast();
            }

            d1.offerLast(i);


            if(d1.getFirst()==i-k){
                d1.pollFirst();
            }


            if(i>=k-1){

                arr[x]=nums[d1.peekFirst()];
                x++;

            }
        }
        return arr ;
    }

    public static void main(String[] args) {
        int[]arr={12,1,78,90,57,89,56};
        int[]arr1=maxSlidingWindow(arr,3);
        System.out.println(Arrays.toString(arr1));
    }
}