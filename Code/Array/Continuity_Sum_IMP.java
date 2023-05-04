package Array;

import java.util.Scanner;

// 5 1 2 3 8 10 11 12 14
//Add only continuity sum like 1 2 3....then break at 8 .....then again sum 10 11 12

//6
//1 2 3 5 7 8
//21 ans

public class Continuity_Sum_IMP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int flag=0,sum=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]+1==arr[i+1]){
                if(flag==0){
                    sum+=(arr[i]+arr[i+1]);
                    flag=1;
                }else{
                    sum+=(arr[i+1]);
                }
            }else{
                flag=0;
            }
        }
        System.out.println(sum);
    }
}
