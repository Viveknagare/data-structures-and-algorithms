import java.util.*;

public class Quicksort {

    public static int partition(int[]arr,int low,int high){
        int i=-1;
        int pivot=arr[high];
        for(int j=0;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;

        return i;
    }

    public static void quicksort(int[]arr,int low, int high){
        if(low<high){
            int pivotindex=partition(arr,low,high);

            //recursive calls
            quicksort(arr,low,pivotindex-1);
            quicksort(arr,pivotindex+1,high);

        }
    }

    public static void main(String[] args) {
        int []arr={6,3,9,5,2,8};

        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
