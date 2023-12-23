import java.util.*;
//Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
//        Input 1: arr = [^ ^ ^ ^ 1 1 1 1 1 1] Output 1: 6
//        Input 2: arr = [ ^ ^ ^ ^ ^ 1 1]


//normal method
//public class Assignment8 {
//
//    public static int ones(int[]arr){
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==1){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int[]arr={0,0,0,0,0,1,1};
//        //function calling
//        int count=ones(arr);
//        System.out.println("the total number of ones are "+count);
//    }
//}



//by binary search
public class Assignment8 {

    public static int ones(int[]arr){
        int count=0;
        int low=0;
       int  high=arr.length-1;
       while(low<=high){
          int  mid=low+(high-low)/2;
           if(arr[mid]==0){
               low=mid+1;
           }else{
               high=mid-1;
           }
       }
       return arr.length-low;
    }

    public static void main(String[] args) {
        int[]arr={0,0,0,0,0,1,1};
        //function calling
        int count=ones(arr);
        System.out.println("the total number of ones are "+count);
    }
}
