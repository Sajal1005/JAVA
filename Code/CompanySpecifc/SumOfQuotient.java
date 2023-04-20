package CompanySpecifc;
import java.util.*;

public class SumOfQuotient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int num=in.nextInt();
            ans+=(num/k);
        }
        System.out.println(ans);
    }
}
