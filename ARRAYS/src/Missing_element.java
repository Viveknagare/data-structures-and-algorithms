import java.util.*;
public class Missing_element{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int p=sc.nextInt();
        int []arr=new int[p];
        for(int i=0;i<p;i++){
            System.out.println("enter the array elements");
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        int sum_naturals=((n+1)*(n+2))/2;
        int sum=0;
        for(int i=0;i<p;i++){
            sum=sum+arr[i];
        }
        int missing=sum_naturals-sum;
        System.out.println("missing element is "+missing);
    }
}