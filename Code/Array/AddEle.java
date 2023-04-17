package Array;
import java.util.*;

public class AddEle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n+1];
        int p = in.nextInt();
        int ele = in.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=n-1;i>p-2;i--){
            arr[i+1]=arr[i];
        }
        arr[p-1]=ele;
        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
