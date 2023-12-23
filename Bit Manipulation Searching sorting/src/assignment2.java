//Q2. WAP to sort an array in descending order using selection sort
//        Input Array {3,5,1,6,0}
//        Output Array: {6, 5, 3, 1, 0}
import java.util.*;
public class assignment2 {

    public  void selectionsort(int []arr){
        for(int i=0;i<arr.length;i++){
            int mid_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[mid_index]){
                    mid_index=j;
                }
            }

            if(mid_index!=i){
                int temp=arr[i];
                arr[i]=arr[mid_index];
                arr[mid_index]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={3,5,1,6,0};
        assignment2 s1=new assignment2();
        s1.selectionsort(arr);
        System.out.println("your sorted array is");
        System.out.println(Arrays.toString(arr));
    }

}
