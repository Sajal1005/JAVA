package Matrix;
import java.util.*;

public class RowwiseSumColumnwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");
        }
        System.out.println();
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}