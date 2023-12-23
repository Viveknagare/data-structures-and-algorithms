//lower bound or first occurence of element
//array must be in sorted form
/*this can be solved using linear search in a array but we will solve it using
binary search as time complexity of binary search is less as compared to linear search*/
//time complexity-O(logN)
//space complexity-O(1)

import java.util.*;
public class Lowerbound{


    public static int binarysearch(int[]arr,int target){
        int low=0,high=arr.length-1,res=-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return res;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the element you want to search in the array");
        int x=sc.nextInt();
        //function calling
        int res=binarysearch(arr,x);

        if(res==-1){
            System.out.println("array element not found");
        }else {
            System.out.println("array element found at index "+res);
        }

    }
}
//time complexity-O(logN)
//space complexity-O(1)