import java.util.*;

public class Stairs_no_of_ways {

    public static int noofways(int n){
        int result=0;
        if(n<=1){
            return n;
        }else{
            result=noofways(n-1)+noofways(n-2);
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of stairs");
        int n=sc.nextInt();
        //function calling and relation between noof ways and fibonacci series
        int res=noofways(n+1);
    }
}
