import java.util.*;

public class Secondlargestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int result=arr[n-2];
        System.out.println("2nd maximum element is "+result);


        //method 2
        int[] arr2={23,43,22,36,38};
        int largest=0,sl=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>largest){
                sl=largest;
                largest=arr2[i];
            }else if(arr2[i]>sl){
                sl=arr2[i];
            }
        }
        System.out.println("2nd largest element is "+sl);
    }
}
