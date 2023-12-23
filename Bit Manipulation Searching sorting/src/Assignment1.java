import java.util.*;
//Write a program to sort an array in descending order using bubble sort.
//        Input Array {3,5,1,6,0}
//        Output Array: {6, 5, 3, 1, 0}

public class Assignment1 {

    public static void bubblesort(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }
            if(!swapped==true){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={3,5,1,6,0};
        bubblesort(arr);
        System.out.println("the sorted array is");
        System.out.println(Arrays.toString(arr));

    }
}
