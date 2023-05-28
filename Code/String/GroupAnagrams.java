package String;
import java.util.*;
// done
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> ans = new ArrayList<>();
        String[] sort  = new String[str.length];
        for(int i=0;i<str.length;i++){
            String s = str[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            sort[i]=new String(chars);
        }
        for(int i=0;i<sort.length;i++){
            if(sort[i]=="#"){continue;}
            ArrayList<String> ans2 = new ArrayList<>();
            ans2.add(str[i]);
            for(int j=i+1;j<sort.length;j++){
                if(sort[i].equals(sort[j])){
                    ans2.add(str[j]);
                    sort[j]="#";
                }
            }
            ans.add(ans2);
        }
        System.out.println(Arrays.toString(sort));
        return ans;
    }
}
