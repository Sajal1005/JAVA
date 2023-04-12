package Basic;
import java.util.*;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if(c=='a' || c=='A' || c=='E' || c=='e' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
            System.out.println("Vowel");
        }else if(c>='a' && c<='z' || c>='A' && c<='Z'){
            System.out.println("Consonant");
        }else{
            System.out.println("Neither vowel nor consonant");
        }
    }
}
