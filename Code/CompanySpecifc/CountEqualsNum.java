package CompanySpecifc;
import java.util.*;

public class CountEqualsNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=-1;
        int n = in.nextInt();
        int arr[] = new int[n];
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
            if(count==arr[i]){
                ans = Math.max(ans,arr[i]);
            }
        }
        System.out.println(ans);
    }
}
