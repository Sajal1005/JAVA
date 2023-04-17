package Array;
import java.util.*;
public class DeleteEle {
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=p-1;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
