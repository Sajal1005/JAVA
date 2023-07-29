import java.util.*;

public class OnlineClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int flag=0,flag2=0;
                for(int k=i;k<j;k++){
                    if(arr[k]>arr[k+1]){
                        if(flag==0) {
                            flag = 1;
                            flag2=1;
                        }else{
                            flag2=0;
                            break;
                        }
                    }
                }
                if(flag2==1 || flag==0){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
