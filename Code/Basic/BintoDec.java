package Basic;
import java.util.*;

public class BintoDec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),ans=0,count=0;
        while(n!=0){
            int r=n%10;
            ans+=(Math.pow(2,count)*r);
            count++;
            n/=10;
        }
        System.out.println(ans);
    }
}
