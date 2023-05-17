package ST2;
import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer s = new StringBuffer(in.nextLine());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                s.setCharAt(i,(char)(s.charAt(i)-32));
            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                s.setCharAt(i,(char)(s.charAt(i)+32));
            }
        }
        System.out.println(s);
    }
}
