import java.util.*;

public class Test30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int m1=in.nextInt();
        int arr1[][] = new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                arr1[i][j]=in.nextInt();
            }
        }
//        int n2=in.nextInt();
//        int m2=in.nextInt();
//        int arr2[][] = new int[n2][m2];
//        for(int i=0;i<n2;i++){
//            for(int j=0;j<m2;j++){
//                arr2[i][j]=in.nextInt();
//            }
//        }
//        int arr3[][] = new int[n1][m2];
//        for(int i=0;i<n1;i++){
//            for(int j=0;j<m2;j++){
//                arr3[i][j]=0;
//            }
//        }
//        for(int i=0;i<n1;i++){
//            for(int j=0;j<m2;j++){
//                for(int k=0;k<n2;k++){
//                    arr3[i][j]+=(arr1[i][k]*arr2[k][j]);
//                }
//                System.out.print(arr3[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int j=0;j<m1;j++){
//            for(int i=0;i<n1;i++){
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }
        int sum=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                if(i==j){
                    sum+=(arr1[i][j]);
                }
            }
        }
        System.out.println(sum);
    }
}
