import java.util.Scanner;

public class Reversing_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of the array");
        int x= sc.nextInt();
        int[]arr=new int[x];
        int n=arr.length;

         for(int i=0;i<n;i++){
             System.out.println("enter the array element");
             arr[i]=sc.nextInt();
         }


         for (int i=0;i<n/2;i++){
             int temp=arr[i];
             arr[i]=arr[n-i-1];
             arr[n-i-1]=temp;

         }

        System.out.println("reversal of array is ");

         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }




    }
}
//time complexity o(n) as we have used one-one loop for taking swapping and priting array
//space complexity is o(1) as we have used only one array and in that array only qwe have performed swapping
