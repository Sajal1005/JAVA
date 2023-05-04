package Array;
import java.util.*;

public class Pipes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

//        SOL 1
//        for(int i=1;i<n;i++){
//            int j=i-1;
//            while(arr[j]==-99 && j>=0){
//                j--;
//            }
//            if(arr[i]>arr[j]){
//                arr[i]=-99;
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(arr[i]!=-99){
//                System.out.print(arr[i]+" ");
//            }
//        }

//        SOL2
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<=min){
                System.out.print(arr[i]+" ");
                min=arr[i];
            }
        }


    }
}
