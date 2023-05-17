package ST2;
import java.util.*;

public class Reverse_Vowels_String {
    public static boolean vowel(char c){
        if(c=='A' || c=='e' || c=='i' || c=='o' || c=='u' || c=='a' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer s = new StringBuffer(in.nextLine());
        String vow="";
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                vow+=s.charAt(i);
            }
        }
        int j=vow.length()-1;
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                s.setCharAt(i,vow.charAt(j--));
            }
        }
        System.out.println(s);
    }
}
