import java.util.*;
public class Binarysearch_recursion {

    public static int binarysearch(int low,int high,int target,int[]arr){
        int result=-1;
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            result=binarysearch(mid+1,high,target,arr);
        }else{
            result=binarysearch(low,high-1,target,arr);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={2,3,5,7,8};
        System.out.println("enter the target element");
        int target=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        int result=binarysearch(low,high,target,arr);
        System.out.println("element found at "+result);

    }
}

//recurrence relation for the code is=
//

