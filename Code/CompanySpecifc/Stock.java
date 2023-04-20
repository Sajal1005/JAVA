package CompanySpecifc;
import java.util.*;

public class Stock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        while(n!=0){
            if(n%2==0){
                n/=2;
            }else{
                n-=1;
            }
            count++;
        }

    }
}
