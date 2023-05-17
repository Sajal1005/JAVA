package ST2;
import java.util.*;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer s = new StringBuffer(in.nextLine());
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                s.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.println(s);
    }
}
