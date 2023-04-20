package CompanySpecifc;
import java.util.*;

public class SumOfNonPrime {
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
        int sum=0;
        while(n!=0){
            int r=n%10;
            if(!prime(r)){
                sum+=r;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}
