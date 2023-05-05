package String;

public class Reverse_Words_String {
    public String reverseWords(String s) {
        s=s.trim();
        String ans="";
        int i=s.length()-1,j=s.length()-1;
        while(i>=0 && j>=0){
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            for(int k=j+1;k<=i;k++){
                ans+=(s.charAt(k));
            }
            if(j!=-1){
                ans+=(' ');
            }
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            i=j;
        }
        return ans;
    }
}
