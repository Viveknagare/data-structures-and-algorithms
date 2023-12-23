//print the sum of elements present on the even indices of the array

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }

        System.out.println("the sum of the given array is "+sum);
    }
}
