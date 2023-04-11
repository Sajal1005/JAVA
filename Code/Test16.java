import java.util.*;

public class Test16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        int n=in.nextInt();
        while(n!=0){
            int r=n%10;
            ans*=10;
            ans+=r;
            n/=10;
        }
        System.out.println(ans);
    }
}
