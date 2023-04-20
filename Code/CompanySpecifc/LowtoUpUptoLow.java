package CompanySpecifc;
import java.util.*;

public class LowtoUpUptoLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ans ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                char c = s.charAt(i);
                c-=32;
                ans+=(c);
            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                char c = s.charAt(i);
                c+=32;
                ans+=(c);
            }
        }
        System.out.println(ans);
    }
}
