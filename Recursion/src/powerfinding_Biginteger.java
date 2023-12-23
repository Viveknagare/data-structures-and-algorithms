import java.math.BigInteger;
import java.util.*;
public class powerfinding_Biginteger{

    public static BigInteger powerelement(BigInteger a,int b){
        BigInteger result,finalresult;
        if(b==1){
            return a;
        }else{
            result=powerelement(a,b/2);
            finalresult=result.multiply(result);

            if(b%2==0){
                return finalresult;
            }else{
                return a.multiply(result);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and b");
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();
        BigInteger result=powerelement(a,b);
        System.out.println("the ans is "+result);
    }
        }