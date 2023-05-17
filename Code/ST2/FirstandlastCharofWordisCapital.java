package ST2;
import java.util.*;

// WELCOME TO PUNJAB = WelcomE TO PunjaB
// wElcOme tO PunJAB = WelcomE TO PunjaB

public class FirstandlastCharofWordisCapital {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        s=s.toLowerCase();
        StringBuffer str = new StringBuffer(s);
        if(str.charAt(0)>='a' && str.charAt(0)<='z'){
            str.setCharAt(0,(char)(str.charAt(0)-32));
        }
        if(str.charAt(str.length()-1)>='a' && str.charAt(str.length()-1)<='z'){
            str.setCharAt(str.length()-1,(char)(str.charAt(str.length()-1)-32));
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                if(str.charAt(i+1)>='a' && str.charAt(i+1)<='z'){
                    str.setCharAt(i+1,(char)(str.charAt(i+1)-32));
                }
            }
        }
    }
}
