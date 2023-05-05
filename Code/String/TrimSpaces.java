package String;
import java.util.*;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                System.out.print(s.charAt(i));
            }
        }

    }
}
