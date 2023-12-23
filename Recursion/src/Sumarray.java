// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Sumarray {

    public static void sumarray1(int []arr,int max,int sum,int i){

        try {
            if (i > max) {
                System.out.println(sum);

            }
            sum = sum + arr[i];
            i = i + 1;
            sumarray1(arr, 4, sum, i);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        sumarray1(arr,4,0,0);
        
    }
}
