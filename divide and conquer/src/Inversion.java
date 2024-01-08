import java.util.*;

public class Inversion {


    public static int mergeprocedure(int[]arr,int low,int mid,int high){
        int[]leftsub=Arrays.copyOfRange(arr,low,mid+1);
        int[]rightsub=Arrays.copyOfRange(arr,mid+1,high+1);

        int i=0,j=0,swap=0;
        int k=low;
        while(i<leftsub.length && j< rightsub.length){
            if(leftsub[i]<=rightsub[j]){
                arr[k]=leftsub[i];
                i++;
            }else{
                arr[k]=rightsub[j];
                j++;
                swap+=(mid+1)-(low+i);
            }
            k++;
        }

        while(i< leftsub.length){
            arr[k++]=leftsub[i++];
        }

        while(j< rightsub.length){
            arr[k++]=rightsub[j++];
        }

        return swap;
    }
    public static int DandC(int []arr,int low,int high){
        int count=0;

        if(low<high){
            int mid=low+(high-low)/2;
            count+=DandC(arr,low,mid);
            count+=DandC(arr,mid+1,high);
            count+=mergeprocedure(arr,low,mid,high);

        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr={1,5,2,8,3,4};
        int n=arr.length;
        int count=DandC(arr,0,n-1);

        //brute force approch
//        for(int i=0;i<n-1;i++) {
//            for(int j=i+1;j<n;j++){
//                if(arr[i]>arr[j]){
//                    count++;
//                }
//            }
//        }

        System.out.println(count);
    }
}
