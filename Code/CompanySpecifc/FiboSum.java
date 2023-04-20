package CompanySpecifc;
import java.util.*;

public class FiboSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0,b=1,sum=0;
        for(int i=0;i<n;i++){
            sum+=a;
            int temp=b;
            b+=a;
            a=temp;
        }
        System.out.println(sum);
    }
}
