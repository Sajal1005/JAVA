package Matrix;
import java.util.*;

//Take 4 var t,d,l,r and dir
//https://youtu.be/1ZGJzvkcLsA

public class SpiralPrint {
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
        int top=0,down=n-1,left=0,right=m-1,dir=0;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=top;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                }
                top+=1;
            }else if(dir==1){
                for(int i=top;i<=down;i++){
                    System.out.print(arr[i][right]+" ");
                }
                right-=1;
            }else if(dir==2){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[down][i]+" ");
                }
                down-=1;
            }else if(dir==3){
                for(int i=down;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left+=1;
            }
            dir=(dir+1)%4;
        }
    }
}
