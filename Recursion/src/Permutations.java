import java.util.*;

public class Permutations {

    public static void printpermutations(int start,int dest,String path){

        if(start>dest){
            return;
        }

        printpermutations(0,2,path+"a");
        printpermutations(1,2,path+"b");
        printpermutations(2,2,path+"c");
    }

    public static void main(String[] args) {
        printpermutations(0,0,"");
    }
}
