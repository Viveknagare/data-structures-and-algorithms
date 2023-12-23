import java.util.*;

public class Assignment_2d {
    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));
        System.out.println("enter the no of rows");
        int rows=sc.nextInt();
        System.out.println("enter the no of cols");
        int cols=sc.nextInt();
        int[][]arr=new int[rows][cols];
        System.out.println("enter the array elements");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int j=0;j<cols;j++){
            int i=1;
            System.out.println(arr[i][j]);
        }

        for(int i=0;i<rows;i++) {
            int j = 1;
            if (i != rows - i - 1) {
                System.out.println(arr[i][j]);
            }
        }

        //method 2

        for(int i = 0 ; i < rows ; i++)System.out.print(arr[i][rows/2] + "  ");
        for(int j = 0 ; j < rows ; j++){
            if(j == rows/2)continue;
            System.out.print(arr[rows/2][j] + "  ");
        }
    }
}

