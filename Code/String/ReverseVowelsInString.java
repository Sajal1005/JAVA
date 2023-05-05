package String;

public class ReverseVowelsInString {
    public boolean vowel(char c){
        if(c=='i' || c=='o' || c=='a' || c=='u' || c=='e' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }else{
            return false;
        }
    }
    public String reverseVowels(String s) {
        String n = "";
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                n+=(s.charAt(i));
            }
        }
        int j=n.length()-1;
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                s=s.substring(0,i)+n.charAt(j)+s.substring(i+1);
                j--;
            }
        }
        return s;
    }
}
