import java.util.*;

public class Powerfinding {
    public static int powerofelement(int a,int b){
        int result=0;
        if(b==1){
            return a;
        }else{
            result=a*powerofelement(a,b-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int res=powerofelement(a,b);
        System.out.println("the value is "+res);
    }
}
