package String;
import java.util.*;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String str) {
        Set<Character> s = new HashSet<>();
        int ans=0;
        int count=0;
        int i=0,j=0,k=0;
        while(i<str.length() && j<str.length()){
            if(!s.contains(str.charAt(j))){
                s.add(str.charAt(j));
                count++;
                ans=Math.max(count,ans);
                j++;
            }else{
                s.clear();
                i=j=k+1;
                k++;
                count=0;
            }
        }
        return ans;
    }
}
