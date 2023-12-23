import java.util.*;
//if n=5 then print alternate + and - series of natural number.eg n=5,then 1-2+3-4+5=3
public class Leetcode_problem {
    public static int naturalnum(int n){
        int result=0;
        if(n==0){                      //......or n==1 and return 1
            return 0;
        }else if(n%2==0){
            result=naturalnum(n-1)-n;
        }else{
            result=naturalnum(n-1)+n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
       int result= naturalnum(n);
        System.out.println("the value is "+result);
    }
}
