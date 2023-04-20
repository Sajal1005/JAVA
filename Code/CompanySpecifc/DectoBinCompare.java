package CompanySpecifc;
import java.util.*;

public class DectoBinCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m = in.nextInt();
        int count=0;
        while(n!=0 && m!=0){
            if((n%2)!=(m%2)){
                count++;
            }
            n/=2;
            m/=2;
        }
        if(count%2==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
