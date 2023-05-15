package String;
import java.util.*;

//For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:
//Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
//Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
//Transform #2: 17 ➝ 1 + 7 ➝ 8

//Input: s = "leetcode", k = 2
//        Output: 6
//        Explanation: The operations are as follows:
//        - Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
//        - Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
//        - Transform #2: 33 ➝ 3 + 3 ➝ 6
//        Thus the resulting integer is 6.

public class SumofDigitsofStringAfterConvert {
    public int getLucky(String s, int k) {
        String ans= "";
        for(int i=0;i<s.length();i++){
            ans+=((int)(s.charAt(i))-96);
        }
        while((k--)>0){
            int sum=0;
            for(int i=0;i<ans.length();i++){
                sum+=Integer.parseInt(ans.charAt(i)+"");
            }
            ans=Integer.toString(sum);
        }
        return Integer.parseInt(ans);

    }
}
