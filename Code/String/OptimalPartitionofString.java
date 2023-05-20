package String;
import java.util.*;

public class OptimalPartitionofString {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                count++;
                set.clear();
                i--;
            }
        }
        return count+1;
    }
}
