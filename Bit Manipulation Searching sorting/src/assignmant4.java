import java.util.*;
//WAP to sort an array in decreasing order using insertion sort
//        Input Array {3,5,1,6,0}
//        Output Array: {6, 5, 3, 1, 0}
public class assignmant4 {

    public static void insertionsort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={3,5,1,6,0};
        insertionsort(arr);
        System.out.println("the sorted array is");
        System.out.println(Arrays.toString(arr));

    }
}
