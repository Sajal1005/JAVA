package Matrix;
import java.util.*;

public class AddRightDiagnols {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
