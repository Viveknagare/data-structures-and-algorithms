
//Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
//        not present return -1.
//        Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4 Output 1: 6
//        Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
//        Output 2: -1

import java.util.*;

public class assignment7 {

    public static int  binarysearch(int []arr,int target){
        int element=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                element=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return element;
    }

    public static void main(String[] args) {
        int[]arr={1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        int x=4;
        int res=binarysearch(arr,x);
        System.out.println("the last occurence of 4 found at index "+res);
    }
}
