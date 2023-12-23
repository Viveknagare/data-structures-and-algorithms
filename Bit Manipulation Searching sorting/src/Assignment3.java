import java.util.*;
//Find out how many pass would be required to sort the following array in decreasing order
//        using bubble sort
//        Input Array {3,5,1,6,0}
//no of pass is the total iterations required to sort the array

//Original Array is {3 5 1 6 0}
//        In first iteration array is {5 3 6 1 0}
//        In second iteration array is {5 6 3 1 0}
//        In third iteration array is {6 5 3 1 0}

public class Assignment3 {

    public static int bubblesort(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean swapped= false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }else{
                count++;
            }

        }

       return count;
    }
    //yaaha pe ham count ka value i se bhi initialize karsakte hein yani i=2 pe array sort ho jayega
    //so total iterations requires will be 0,1,2 that is 3 iterations therefore return karte wakt
    //count+1 return karenge


    public static void main(String[] args) {

        int[]arr= {3,5,1,6,0};
        int pass=bubblesort(arr);
        System.out.println("the total number of pass required is "+pass);

    }
}
