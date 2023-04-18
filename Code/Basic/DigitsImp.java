package Basic;
import java.util.*;

public class DigitsImp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2 = in.nextInt();
        int n3= in.nextInt();
        int ans=0,n=0;
        for(int i=0;i<4;i++){
            int num=0;
            if(i%2!=0){
                 num = Math.min(Math.min(n1%10,n2%10),n3%10);
            }else{
                num = Math.max(Math.max(n1%10,n2%10),n3%10);
            }
            ans*=10;
            ans+=num;
            n1/=10;
            n2/=10;
            n3/=10;
        }
        n=ans;
        ans=0;
        while(n!=0){
            ans*=10;
            ans+=(n%10);
            n/=10;
        }
        System.out.println(ans);
    }
}
