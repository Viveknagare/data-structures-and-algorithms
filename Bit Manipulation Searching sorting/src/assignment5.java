//Find out the number of iterations to sort the array in descending order using selection sort.
//        Input Array {3,5,1,6,0}
//Original Array is {3 5 1 6 0}
// In first iteration array is {6 5 1 3 0}
// In second iteration array is {6 5 1 3 0}
// In third iteration array is {6 5 3 1 0}
// Now the array is sorted.
import java.util.*;
public class assignment5 {

    public static int selectionsort(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j-1]<arr[j]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr={3,5,1,6,0};
        int iterations=selectionsort(arr);
        System.out.println("the total iterations required is "+iterations);
    }
}
