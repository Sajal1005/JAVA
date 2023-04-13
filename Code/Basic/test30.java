package Basic;
import java.util.*;

public class test30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        System.out.println("Max is "+max+"\nMin is "+min);
    }
}
