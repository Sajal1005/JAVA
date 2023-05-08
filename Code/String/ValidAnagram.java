package String;
import java.util.*;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s="";
        for(int i=0;i<chars.length;i++){
            s+=(chars[i]);
        }
        chars = t.toCharArray();
        Arrays.sort(chars);
        t="";
        for(int i=0;i<chars.length;i++){
            t+=(chars[i]);
        }
        return (s.equals(t));
    }
}
