//1063 leetcode hard

import java.util.*;
public class Subarrays_leftSmallestElement {
    public static void main(String[] args) {
        int[]height={1,4,2,5,3};
        Stack<Integer>s1=new Stack<>();
        int[]nse=new int[height.length];

        //first push the zero index
        s1.push(0);
        for(int curr=1;curr<height.length;curr++){
            while(!s1.empty() && height[s1.peek()] > height[curr]){
                nse[s1.pop()]=curr;
            }
            s1.push(curr);
        }

        while(!s1.empty())nse[s1.pop()]=height.length;

        int sum=0;
        for(int i=0;i<nse.length;i++) {
            sum+=(nse[i]-i);
        }

        System.out.println(sum);

    }
}
