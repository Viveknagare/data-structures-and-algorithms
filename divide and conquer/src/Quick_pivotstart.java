import java.util.*;
public class Quick_pivotstart {

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
    public static void quicksort(int[]arr,int low,int high) {
        if (low < high) {
            int m = partition(arr, low, high);
            quicksort(arr, low, m - 1);
            quicksort(arr, m + 1, high);
        }
    }

    public static void printarr(int []arr,int n ){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[]arr={50,20,70,90,10,13,17,21};
        int n=arr.length;
        System.out.println("array before sorting is ");
        printarr(arr,n);
        System.out.println("array before sorting is" );
        quicksort(arr,0,n-1);
        printarr(arr,n);
    }
}
