package CompanySpecifc;
import java.util.*;

public class ScienceComp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int k = in.nextInt();
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            if((k--)>0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
