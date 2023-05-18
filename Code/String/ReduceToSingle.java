package String;
import java.util.*;

public class ReduceToSingle {
    public static int cal(int n){
        while(!(n>=0 && n<=9)){
            int sum=0;
            while(n!=0){
                sum+=(n%10);
                n/=10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            int n = cal((int)(s.charAt(i)));
            sum+=n;
        }
        System.out.println(sum);
    }
}
