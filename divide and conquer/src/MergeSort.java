public class MergeSort{

    public static void mergeprocedure(int[]arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[]leftsub=new int[n1];
        int[]rightsub=new int[n2];

        for(int i=0;i<n1;i++) {
            leftsub[i]=arr[low+i];
        }

        for(int j=0;j<n2;j++) {
            rightsub[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(leftsub[i]<=rightsub[j]){
                arr[k]=leftsub[i];
                i++;
            }else{
                arr[k]=rightsub[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=leftsub[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightsub[j];
            j++;
            k++;
        }

    }
    public static void mergesort(int []arr,int low ,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);

            mergeprocedure(arr,low,mid,high);
        }
    }
    public static void printarr(int[]arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={50,20,40,90,88,11,13};
        int n=arr.length;
        System.out.println("array before sorting is ");
        printarr(arr,n);
        mergesort(arr,0,n-1);
        System.out.println();
        System.out.println("array after sorting is ");
        printarr(arr,n);
    }
}
