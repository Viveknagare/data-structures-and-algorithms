import java.util.*;

public class bruteforce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[4][4];
        System.out.println("enter the values of the matrix");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("enter the column and row of 1st element");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("enter the column and row of second element");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int sum=0;


          //brute force approach
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }

        System.out.println("the reqired prefix sum is "+sum);

    }
}

//time complexity o(m*n)
//space complecity o(1)
