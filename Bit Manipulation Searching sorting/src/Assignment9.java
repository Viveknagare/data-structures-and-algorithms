
//Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element is
//        not found in the array, report that as well.
//        Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9] target = 5
//        Output: Target 5 occurs 3 times
//        Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9] target = 6
//        Output: Target 6 occurs 2 times

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Assignment9 {

    public static int firstoccurence(int[]arr,int target){
        int low=0;
        int res1=-1;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                res1=mid;
                high=mid-1;// trying to find the minimum index at which value x is present
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
       return res1;
    }
    public static int lastoccurence(int []arr,int target){
        int low=0;
        int res2=-1;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                res2=mid;
                low=mid+1;//if you found the target or if target is greater than the current element, to find last occurrence move to right half of the array
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res2;
    }


    public static void main(String[] args) {
        int []arr={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int x=5;
        int lowerocc=firstoccurence(arr,x);
        int higherocc=lastoccurence(arr,x);

        if(lowerocc==higherocc &&lowerocc==-1){
            System.out.println("the element does not exist in the array");
        }else {
            System.out.println("the target "+x+" occurs "+ (higherocc-lowerocc+1) +" times");
        }

    }
}
