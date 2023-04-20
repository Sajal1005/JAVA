package CompanySpecifc;
import java.util.*;

public class ProductcodeFromBarcode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=0;
        int n =in.nextInt();
        while(n!=0){
            int r=n%10;
            num*=10;
            num+=r;
            n/=10;
        }
        n=num;
        while(n!=0){
            int r=n%10;
            char c = (char)(r+97);
            System.out.print(c);
            n/=10;
        }

    }
}
