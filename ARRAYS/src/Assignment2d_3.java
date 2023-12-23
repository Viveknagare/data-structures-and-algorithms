import java.util.*;

public class Assignment2d_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int rows=sc.nextInt();
        System.out.println("enter the no of rows");
        int cols= sc.nextInt();
        int [][]arr=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the matrix elements");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    System.out.println(arr[i][j]+" ");
                }else if(i+j==rows-1 ){
                    System.out.println(arr[i][j]+" ");
                }

            }
        }

        //method 2

        for(int i=0;i<rows;i++){
            System.out.println(arr[i][i]+" ");

            if(i!=rows-1-i){
                System.out.println(arr[i][rows-1-i]);
            }


        }

    }
}
