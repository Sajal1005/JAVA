import java.util.*;

public class Test19 {
    public static void main(String[] args) {
        char c;
        Scanner in = new Scanner(System.in);
        c = in.next().charAt(0);
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
