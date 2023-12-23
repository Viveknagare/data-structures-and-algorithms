import java.util.*;
public class Array2dinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no of rows");
        int rows=sc.nextInt();
        System.out.println("enter the no of columns");
        int col=sc.nextInt();
        int total=rows*col;
        int [][]arr=new int[rows][col];
        System.out.println("enter the "+total+" rows and columns");

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();

            }
            
        }


        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
