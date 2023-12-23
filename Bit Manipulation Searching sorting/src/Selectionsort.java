import java.util.*;

public class Selectionsort {

    public static void selectionsort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;//minindex is taking the index of minimum element in every iteration
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;//here we store the new index of minimum value in min index
                }
            }
            if(min_index!=i){//here we swap the the value of i index with the new minimum value present at index min_index
                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={20,50,10,15,17,25,65};
        selectionsort(arr);
        System.out.println("sorted array is");
        System.out.println(Arrays.toString(arr));
    }
}
