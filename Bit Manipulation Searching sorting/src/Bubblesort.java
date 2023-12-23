import java.util.*;
public class Bubblesort {

    public static void bubblesort(int []arr){
        int n= arr.length;
        for(int i=0;i<arr.length;i++){//outer loop for iteartions
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++){//inner loop for swapping
                if(arr[j]>arr[j+1]){//swapping of two nos
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                    swapped=true; //if swapped then value becomes true
                }

                if(!swapped==true){//if no swapping takes place that is array is sorted no need to itearte the array then we will write this condition
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr={20,50,10,40,100,90};
        //function calling
        bubblesort(arr);

        System.out.println("the sorted array is");
        System.out.println(Arrays.toString(arr));
    }
}
//time complexity-O(n*n)
//space complexity-O(1)
