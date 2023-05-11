package String;

public class RotateString {
    public String rotate(String s){
        String ans="";
        ans+=(s.charAt(s.length()-1));
        if(s.length()>2){
            for(int i=0;i<s.length()-1;i++){
                ans+=(s.charAt(i));
            }
        }
        return ans;
    }
    public boolean rotateString(String s, String g) {
        if(s.length()!=g.length()){
            return false;
        }
        int n=s.length();
        while((n--)>0){
            s=rotate(s);
            if(s.equals(g)){
                return true;
            }
        }
        return false;
    }
}
