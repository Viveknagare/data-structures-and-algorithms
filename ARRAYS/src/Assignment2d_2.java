import java.util.*;

public class Assignment2d_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int rows=sc.nextInt();
        System.out.println("enter the no of columns");
        int cols=sc.nextInt();
        int[][]arr=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        //but this is not valid of everymatrix that user inputs
        System.out.println(arr[0][0] +" "+arr[0][1]+" "+arr[1][0]);

        //method 2
        //valid for all types of matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i+j<cols-1){
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}
