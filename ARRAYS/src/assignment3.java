/*Given an array. Find the first peak element in the array. A peak element is an element that is greater than
        its just left and just right neighbor.*/

import java.util.*;
public class assignment3 {
    public static void main(String[] args) {
        int []arr={22,34,23,45,46};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println("the peak element of the array is "+arr[i]);
            }
        }
    }
}
