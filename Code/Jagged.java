import java.util.*;

public class Jagged{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][];
        for(int i=0;i<n;i++){
            int m=in.nextInt();
            arr[i] = new int[m];
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}