package Matrix;
import java.util.*;

public class AddLeftDiagnols {
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
        int k = m-1;
        for(int i=0;i<n;i++){
            System.out.print(arr[i][k--]+" ");
        }
    }
}
