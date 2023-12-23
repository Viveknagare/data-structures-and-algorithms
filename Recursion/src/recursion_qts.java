//if given a number say n=4 and k=5
//then write the table of 4 upto multiple of 5
import java.util.*;
public class recursion_qts {

   public static void mul(int n,int k){
       if(k==1){
           System.out.println(n);
           return;
       }
       mul(n,k-1);
       System.out.println(n*k);
   }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n and k");
        int n=sc.nextInt();
        int k=sc.nextInt();
        mul(n,k);



    }
}
