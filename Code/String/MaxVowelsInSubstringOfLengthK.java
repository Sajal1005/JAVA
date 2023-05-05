package String;
import java.util.*;

public class MaxVowelsInSubstringOfLengthK {
    public boolean vowel(char c){
        if(c=='i' || c=='o' || c=='a' || c=='u' || c=='e' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }else{
            return false;
        }
    }
    public int maxVowels(String s, int k) {
        int ans=0;
        int i=0,j=k-1;
        int count=0;
        for(int r=i;r<=j;r++){
            if(vowel(s.charAt(r))){
                count++;
            }
        }
        ans=count;
        while(j<s.length()-1){
            i++;j++;
            if(vowel(s.charAt(j))){
                count++;
            }
            if(vowel(s.charAt(i-1))){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}
