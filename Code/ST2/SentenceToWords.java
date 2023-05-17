package ST2;
import java.util.*;
// IAmACompetitiveProgrammer
// I
//Am
//A
//Competitive
//Programmer

public class SentenceToWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ans=s.charAt(0)+"";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                System.out.println(ans);
                ans=s.charAt(i)+"";
            }else{
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
