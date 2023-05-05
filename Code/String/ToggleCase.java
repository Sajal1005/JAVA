package String;
import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans+=((char)(s.charAt(i)-32));
            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ans+=((char)(s.charAt(i)+32));
            }else{
                ans+=((char)(s.charAt(i)));
            }
        }
        System.out.println(ans);
    }
}
