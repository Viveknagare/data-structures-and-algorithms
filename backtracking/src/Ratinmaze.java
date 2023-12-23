import java.util.*;

public class Ratinmaze{

    private static void ratinmaze(int sr,int sc,int er,int ec,String path,int[][]arr,boolean[][]maze){

        if(sr<0 || sc<0)return;
        if(sr>er || sc>ec)return;

        if(sr==er && sc==ec) {
            System.out.println(path);
            return;
        }

        if(arr[sr][sc]==0)return;

        if(maze[sr][sc]==true)return;

        maze[sr][sc] = true;

        ratinmaze(sr,sc+1,er,ec,path+"R",arr,maze);
        ratinmaze(sr+1,sc,er,ec,path+"D",arr,maze);
        ratinmaze(sr,sc-1,er,ec,path+"L",arr,maze);
        ratinmaze(sr-1,sc,er,ec,path+"U",arr,maze);

        maze[sr][sc] = false;


    }
    public static void main(String[] args) {



        int rows=3;
        int cols=4;
        int[][]arr={
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        boolean[][]maze=new boolean[rows][cols];

        ratinmaze(0,0,rows-1,cols-1,"",arr,maze);
    }
}