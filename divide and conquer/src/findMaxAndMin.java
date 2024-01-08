//import java.util.*;
//public class findMaxAndMin{
//
//    static class Pair{
//        int min;
//        int max;
//    }
//
//    public static Pair getminmax(int[]arr,int low,int high){
//        Pair minmax=new Pair();
//        Pair minmaxLeft=new Pair();
//        Pair minmaxRight=new Pair();
//
//        if(low==high){
//            minmax.min=arr[low];
//            minmax.max=arr[low];
//            return minmax;
//        }
//
//        else if(low==high-1){
//            if(arr[low]<arr[high]){
//                minmax.min=arr[low];
//                minmax.max=arr[high];
//            }else{
//                minmax.min=arr[high];
//                minmax.max=arr[low];
//            }
//            return minmax;
//        }else {
//
//            int mid = low + (high - low) / 2;
//            minmaxLeft = getminmax(arr, low, mid);
//            minmaxRight = getminmax(arr, mid + 1, high);
//            //compare minimum values on left and right
//            if (minmaxLeft.min < minmaxRight.min) {
//                minmax.min = minmaxLeft.min;
//            } else {
//                minmax.min = minmaxRight.min;
//            }
//
//            //compare maximum values on left and right
//            if (minmaxLeft.max < minmaxRight.max) {
//                minmax.max = minmaxRight.max;
//            } else {
//                minmax.max = minmaxLeft.max;
//            }
//            return minmax;
//        }
//    }
//    public static void main(String[] args) {
//        int[]arr={50,45,11,9,15,75,89,97};
//        int n=arr.length;
//        Pair minmax=getminmax(arr,0,n-1);
//        System.out.println("the maximum value is "+minmax.min);
//        System.out.println("the minimum value is "+minmax.min);
//    }
//}




public class findMaxAndMin {
    static class Pair{
        int min;
        int max;
    }

    // function definition
    public static Pair getMinMax(int[] arr, int i, int j){
        Pair minmax = new Pair();
        Pair minmaxLeft = new Pair();
        Pair minmaxRight = new Pair();

        // 1. Small problem
        // if number of elements is equal to 1
        if(i == j){
            minmax.min = arr[i];
            minmax.max = arr[i];
            return minmax;
        }

        // if number of elements is equal to 2
        else if(i == j-1){
            if(arr[i] < arr[j]){
                minmax.min = arr[i];
                minmax.max = arr[j];
            }
            else{
                minmax.min = arr[j];
                minmax.max = arr[i];
            }
            return minmax;
        }

        // 2. Big Problem - Divide and Conquer Approach
        else{
            // 1. Divide - c
            int mid = i + (j-i)/2;
            // 2. Conquer
            // left side subtree - T(n/2)
            // minmaxLeft = min(left), max(left)
            minmaxLeft = getMinMax(arr, i, mid);
            // right side subtree - T(n/2)
            // minmaxRight = min(right), max(right)
            minmaxRight = getMinMax(arr, mid+1, j);
            // 3. Combine - c
            //  Compared the minimum values of left and right
            if(minmaxLeft.min < minmaxRight.min){
                minmax.min = minmaxLeft.min;
            }
            else{
                minmax.min = minmaxRight.min;
            }

            //  Compared the maximum values of left and right
            if(minmaxLeft.max < minmaxRight.max){
                minmax.max = minmaxRight.max;
            }
            else{
                minmax.max = minmaxLeft.max;
            }

            return minmax;
        }
    }


    public static void main(String[] args){
        int[] arr = {50, 45, 11, 9, 15, 75, 89, 97};
        int n = arr.length;

        // function calling
        Pair minmax = getMinMax(arr, 0, n-1);

        System.out.println("The smallest element in an array is:"+minmax.min);
        System.out.println("The largest element in an array is:"+minmax.max);
    }
}