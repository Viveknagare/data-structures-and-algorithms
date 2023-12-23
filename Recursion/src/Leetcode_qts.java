import java.util.*;
//there is a matrix
// 1  3  5  7
//10 11 16 20
//23 30 34 60

//1)here each row is sorted in non decreasing order
//2)the 1st integer of each row is greater than the last integer of each row
//* given a target return true if the target is present in the matrix else return false.
//write solution in O(log(m*n)) i.e binarysearch

//the matrix here is seen in row major form as an 1d array virtually

public class Leetcode_qts {

    public static boolean binarysearch(int[][]arr,int target){
        int low=0;
        int rows=arr.length;
        int cols=arr[0].length;
        int high=rows*cols-1;
        int result=-1;
        while(low<=high){
            int midindex=low+(high-low)/2;
            int midelement=arr[midindex/cols][midindex%cols];//this formula is use to access the middle element in the 2d matrix
            if(midelement==target){
                return true;
            }else if(midelement>target){
                high=midindex-1;
            }else{
                low=midindex+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int [][]arr={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println("enter the target element");
        int target=sc.nextInt();

        boolean result=binarysearch(arr,target);
        if(!result){
            System.out.println("False");
        }else{
            System.out.println("true");
        }


    }
}
