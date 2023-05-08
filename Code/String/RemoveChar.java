package String;
import java.util.*;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        char c = in.next().charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c){
                System.out.print(s.charAt(i));
            }
        }
    }
}
