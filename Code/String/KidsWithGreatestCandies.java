package String;
import java.util.*;

public class KidsWithGreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(candies[i],max);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extra)>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    }
}
