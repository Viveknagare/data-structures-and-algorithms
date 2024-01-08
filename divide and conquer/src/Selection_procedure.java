import java.util.*;
public class Selection_procedure {

    public static int partition(int[]arr,int low,int high){
        int i=low;
        int pivot=arr[i];
        for(int j=i+1;j<=high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[i];
        arr[i]=temp;

        return i;
    }
    public static int selection_procedure(int[]arr,int low,int high,int k) {
        int m = partition(arr, low, high);

            if(m==k-1){
                return arr[m];
            }else if(m<k-1){
                return selection_procedure(arr,m+1,high,k);
            }
        return selection_procedure(arr,low,m-1,k);
        }



    public static void main(String[] args) {
        int[]arr={50,20,70,90,10,13,17,21};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of k");
        int k=sc.nextInt();

        int num=selection_procedure(arr,0,n-1,k);
        System.out.println("3rd smallest element is "+num);

    }
}
