//Write a program to calculate the maximum element in the array.

import java.util.*;
public class Max_elementarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
       int []arr=new int[n];
        System.out.println("enter the array elements");

       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }


       int max=arr[0];
       for(int i=1;i<n;i++) {
           if (arr[i] > max) {
               max = arr[i];
           }

       }
        System.out.println("the maximum element of the array is "+max);


       //method 2


        int []array={1,4,65,100};
        int max1=Arrays.stream(array).max().getAsInt();
        System.out.println("max element is "+max1);

        //method 3
        int []arr2={1,34,9876,234,23};
        Arrays.sort(arr2);
        int result=arr2[arr2.length-1];
        System.out.println("maximum element is "+result);

    }
}
