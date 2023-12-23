import java.util.*;

public class Optimized_approach_power {

    public long powerofelement(int a,int b){
        int mid=0;
        long result=0;
        long finalresult=0;
        if(b==1){
            //base condition
            return a;
        }else{
            //recursive function call
            mid=b/2;
            result=powerofelement(a,mid);
             finalresult=result*result;

             if(b%2==0){
                 return finalresult;
             }else{
                 return a*finalresult;
             }
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();

        Optimized_approach_power o1=new Optimized_approach_power();
        long res=o1.powerofelement(a,b);
        System.out.println("the value is "+res);

    }
}
