package Array;
import java.util.*;

public class PrintUnique {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
