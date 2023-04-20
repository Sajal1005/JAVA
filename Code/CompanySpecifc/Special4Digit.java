package CompanySpecifc;
import java.util.*;

public class Special4Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        int ans=0;
        for(int i=0;i<4;i++){
            int n=0;
            if(i%2!=0){
                n=Math.min(Math.min(n1%10,n2%10),n3%10);
            }else{
                n=Math.max(Math.max(n1%10,n2%10),n3%10);
            }
            ans*=10;
            ans+=n;
            n1/=10;n2/=10;n3/=10;
        }
        int n=ans;
        ans=0;
        while(n!=0){
            int r=n%10;
            ans*=10;
            ans+=r;
            n/=10;
        }
        System.out.println(ans);
    }
}
