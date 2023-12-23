import java.util.*;

public class Prefix_Sum_BruteForce {

    public static void finalmatrix(int[][]array){
        //here we have to perform 2 operations
        int rows= array.length;
        int cols=array[0].length;
        //here we transform input matrix into prefix sum by row major form
        for(int i=0;i<rows;i++){
            for(int j=1;j<cols;j++){
                array[i][j]+=array[i][j-1];
            }
        }

        //now we have to transform the prefix sum row major matrix into prefix sum column major matrix
        for(int j=0;j<cols;j++){
            for(int i=1;i<rows;i++){
                array[i][j]+=array[i-1][j];
            }
        }
    }




    public static int requiredsum( int r1,int c1,int r2,int c2,int [][]array){
    //yeh query har baar change hoge according to user input but ek acchi baat hein ki space complexity o(1) hein
        int left=0,total=0,up=0,commonregion=0,finalsum=0;
        total=array[r2][c2];
        left=array[r2][c1-1];
        up=array[r1-1][c2];
        commonregion=array[r1-1][c1-1];
        finalsum=total-left-up+commonregion;
        return finalsum;

    }


    public static void main(String[] args) {

        //2d array basic declarations
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of rows");
         int row=sc.nextInt();
        System.out.println("enter the number of columns");
        int col=sc.nextInt();
        int [][]arr=new int[row][col];

        //taking 2d array input
        System.out.println("enter the matrix elements");
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        int total=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                total+=arr[i][j];
            }
        }



        System.out.println("enter the value of r1");
        int r1=sc.nextInt();
        System.out.println("enter the value of c1");
        int c1=sc.nextInt();
        System.out.println("enter the value of r2");
        int r2=sc.nextInt();
        System.out.println("enter the value of c2");
        int c2=sc.nextInt();




        finalmatrix(arr);//this function returns matrix with prefix-sum row and prefix-sum column form which gives a matrix that have direct values of sum

        int result=requiredsum(r1,c1,r2,c2,arr);
        System.out.println("required prefix sum is "+result);
    }
}
