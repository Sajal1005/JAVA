package CompanySpecifc;
import java.util.*;

public class CountDigitInNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int d = in.nextInt();
        int count=0;
        while(n!=0){
            int r=n%10;
            if(r!=d){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
