/*Write a program to traverse over the elements of the array using for each loop and print all even
        elements.*/

import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(var a: arr)
            if (a % 2 == 0) {
                System.out.print(a+ " ");
            }
    }
}
