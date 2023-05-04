import java.util.*;

public class Jagged2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[][] = new int[n][];
        for(int i=0;i<n;i++){
            arr[i] = new int[in.nextInt()];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
