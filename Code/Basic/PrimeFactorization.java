package Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {
    public static boolean prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2;i<n;i++){
            if(n%i==0 && prime(i)){
                arr.add(i);
            }
        }
        int j=0;
        while(n!=1){
            if(n%arr.get(j)==0){
                ans+=(arr.get(j));
                System.out.println(arr.get(j));
                n/=arr.get(j);
            }else{
                j++;
            }
        }

    }
}
