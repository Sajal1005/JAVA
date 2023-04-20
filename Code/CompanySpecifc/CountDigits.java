package CompanySpecifc;
import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
