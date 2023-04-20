package BinarySearch;
import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int l=0,h=n-1;
        while(l<=h){
            int m = l+((h-l)/2);
            if(arr[m]==t){
                System.out.println(m);
                break;
            }else if(t>arr[m]){
                l=m+1;
            }else{
                h=m-1;
            }
        }
    }
}
