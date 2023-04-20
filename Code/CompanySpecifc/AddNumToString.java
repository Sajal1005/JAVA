package CompanySpecifc;
import java.util.*;

public class AddNumToString {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String ans="";
        for(int i=0;i<s.length();i++){
            char c = (char)(s.charAt(i)+n);
            ans+=c;
        }
        System.out.println(ans);
    }
}
