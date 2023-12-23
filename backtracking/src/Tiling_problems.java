import java.util.*;
//suppose there is a board of dimension 2*n and there is a tile of dimension 2*1 here
//we have to fit the tile in the board and in output we have to find the number of ways youll fit the board with tiles
public class Tiling_problems {
    public static int getways(int n){
        if(n<=3){
            return n;
        }else{
            return getways(n-1)+getways(n-2);
        }
    }
public static void main(String[]args){
    System.out.println("for n=3, the total ways are "+getways(3));
    System.out.println("for n=6, the total ways are "+getways(6));
 }

}
