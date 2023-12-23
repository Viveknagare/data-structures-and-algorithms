import java.util.*;
//print all sequence of a string

public class sequence_str {

    public static void printsequence(int initial,int final1,String seq){
        if(initial>final1){
            return;
        }
        if(initial==final1){
            System.out.println(seq);
        }


        printsequence(initial+1,2,seq+1);
        printsequence(initial+2,2,seq+2);

    }
    public static void main(String[] args) {
        printsequence(0,2,"");
    }

}
