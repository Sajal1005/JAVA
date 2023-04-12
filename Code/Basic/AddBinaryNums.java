package Basic;
import java.util.*;

public class AddBinaryNums {
    public static void main(String[] args) {
        int n1,n2,ans=0,carry=0;
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        while(n1!=0 || n2!=0){
            int r1=n1%10,r2=n2%10;
            int sum=r1+r2+carry;
            ans*=10;
            if(sum==0 || sum==1){
                ans+=sum;
                carry=0;
            }else if(sum==2){
                carry=1;
            }else{
                ans+=1;
                carry=1;
            }
            n1/=10;n2/=10;
        }
        while(n1!=0){
            ans*=10;
            ans+=(n1%10);
            n1/=10;
        }
        while(n2!=0){
            ans*=10;
            ans+=(n2%10);
            n2/=10;
        }
        if(carry>0){
            ans*=10;
            ans+=carry;
        }
        System.out.println(ans);
    }
}
