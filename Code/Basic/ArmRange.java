package Basic;

import java.util.*;
public class ArmRange {

    public static boolean arm(int n){
        int num=n,count=0,ans=n;
        while(n!=0){
            count++;
            n/=10;
        }
        n=num;num=0;
        while(n!=0){
            int r=n%10;
            num+=(Math.pow(r,count));
            n/=10;
        }
        if(num==ans){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            if(arm(i)){
                System.out.println(i);
            }
        }
    }
}
