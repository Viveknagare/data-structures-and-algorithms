//
// Q1. Given an array. Find the number X in the array. If the element is present, return the index of the element,
//        else print “Element not found in array”.
//        Input the size of array, array from user and the element X from user. Use Linear Search to find the element.

import java.util.*;
public class assignement6 {

    public static int linearsearch(int []arr,int x){
        int index=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==x){
                index=i;
           }
       }
       return index;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the array you want to search for");
        int x=sc.nextInt();
        int index=linearsearch(arr,x);
        if(index==0){
            System.out.println("array element not found");
        }else{
            System.out.println("array element found at index "+index);
        }
    }

}
