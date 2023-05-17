package String;
import java.util.*;

public class CodeChef {
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
        int t=in.nextInt();
        for(int q=0;q<t;q++){
            int n = in.nextInt();
            for(int i=2;i<100000;i++){
                if((prime(i) && !prime(n+i)) && (n!=i)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
