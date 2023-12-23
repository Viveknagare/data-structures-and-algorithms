import java.util.*;

public class Nqueens {


    private static boolean issafe(char [][]board,int row,int col){

        int n=board.length;

//        for column direction row remains same
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }

        //for row direction column remains the same

        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }

//

        //for north west
        int i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')return false;
            j--;
            i--;
        }

        //for south west

        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q')return false;
            i++;
            j--;

        }
        //for south east

        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q')return false;
            i++;
            j++;
        }

        //for north east
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q')return false;
             i--;
             j++;

        }
        return true;
    }


    public static void nqueen(char[][]board ,int row){
        int n=board.length;
        if(row==n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            return;
        }

        System.out.println();

        for(int j=0;j<n;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                nqueen(board,row+1);
                board[row][j]='X';//backtracking
            }
        }
    }

    public static void main(String[]args) {
        int n=4;
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }

        nqueen(board,0);
    }
}
