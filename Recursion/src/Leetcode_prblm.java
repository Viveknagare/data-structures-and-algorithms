import java.util.*;
//suppose there is a board of length 10
//if you are standing at any position in the board then each position has fixed choices
//each position can have number from 1 to 6 on the dice that is 6 choices then we will have to print the number of ways
//6 choices = 6 recursive calls
public class Leetcode_prblm {

    public static  void dice(int curr,int des,String path ){

        if(curr>des){
            return;
        }

        if(curr==des){
            System.out.println(path);
            return;
        }

        dice(curr+1,des,path+1);//remember in every recursion in every function call 1st recursive call gets executed entirely in every call
        dice(curr+2,des,path+2);
        dice(curr+3,des,path+3);
        dice(curr+4,des,path+4);
        dice(curr+5,des,path+5);
        dice(curr+6,des,path+6);

    }

    public static void main(String[] args) {
        dice(0,9,"");



    }
}
