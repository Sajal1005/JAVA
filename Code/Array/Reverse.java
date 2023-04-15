package Array;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
//        Print in reverse order
//        for(int i=n-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }

//        Reversing
//        int i=0,j=n-1;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;j--;
//        }
//        for(i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
}
