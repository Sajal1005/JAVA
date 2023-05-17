package String;
import java.util.*;

// WELCOME TO PUNJAB = WelcomE TO PunjaB
// wElcOme tO PunJAB = WelcomE TO PunjaB

public class FirstandlastCharofWordisCapital {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            StringBuffer word = new StringBuffer(str[i]);
            for(int j=0;j<word.length();j++){
                if(j==0 || j==word.length()-1){
                    if(word.charAt(j)>='a' && word.charAt(j)<='z'){
                        word.setCharAt(j, (char)(word.charAt(j)-32));
                    }
                }else{
                    if(word.charAt(j)>='A' && word.charAt(j)<='Z'){
                        word.setCharAt(j, (char)(word.charAt(j)+32));
                    }
                }
            }
            String fin = new String(word);
            str[i]=fin;
        }
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
            if(i!=str.length){
                System.out.print(" ");
            }
        }
    }
}
