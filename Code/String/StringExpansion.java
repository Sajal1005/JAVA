package String;
import java.util.*;
//a3b2s1 = aaabbs
public class StringExpansion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                for(int j=0;j<Integer.parseInt(s.charAt(i)+"");j++){
                    System.out.print(s.charAt(i-1));
                }
            }
        }
    }
}
