package String;
import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strs[] = {"flower","flow","flight"};
        Arrays.sort(strs);
        int i=0,j=0;
        String ans="";
        while(i<Math.min(strs[0].length(),strs[strs.length-1].length()) &&  (strs[0].charAt(i)==strs[strs.length-1].charAt(i))){
            ans+=(strs[0].charAt(i));
            i++;
        }
        System.out.println(ans);
    }
}
