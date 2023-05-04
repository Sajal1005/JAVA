package String;
import java.util.*;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s=s.trim();
        System.out.println(s);
        int ans=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)!=' '){
            i--;
            ans++;
        }
        System.out.println(ans);
    }
}
