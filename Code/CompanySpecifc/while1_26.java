package CompanySpecifc;
import java.util.*;

public class while1_26 {
    public static int sum(int n){
        int ans=0;
        while(n!=0){
            ans+=(n%10);
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int n = in.nextInt();
        int s = sum(n);
        if(s>=1 && s<=26){
            System.out.print((char)(s+64));
        }else{
            while (!(s>=1 && s<=26)){
                n=s;
                s=sum(n);
            }
            System.out.println((char)(s+64));
        }
    }
}
