package CompanySpecifc;
import java.util.*;

public class SortinngBackFront {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int i=0,j=n-1;
        while(i<j){
            System.out.print(arr[j]+" ");
            System.out.print(arr[i]);
            System.out.println();
            i++;
            j--;
        }
    }
}
