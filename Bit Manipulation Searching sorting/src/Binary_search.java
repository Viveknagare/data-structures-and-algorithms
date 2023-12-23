import java.util.*;

public class Binary_search {

public static int binarysearch(int[]arr,int target){
    int low=0,high=arr.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;//this is recommended or you can you (low+high)/2
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return -1;

}


    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);//this will sort the array if user enters in any manner. binary search needs sorted array
        System.out.println("enter the number you want to find in array");
        int x=sc.nextInt();

        //binary search
        int res=binarysearch(arr,x);

        if(res==-1){
            System.out.println("array element not found");
        }else{
            System.out.println("array element found at index "+res);
        }

    }
}
//time complexity-O(logN)
//space complexity-O(1)