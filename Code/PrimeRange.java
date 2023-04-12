import java.util.*;

public class PrimeRange {

    public static boolean prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
}
