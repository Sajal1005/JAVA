package String;
import java.util.*;

public class RremoveConsecutiveDuplicates {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        StringBuffer s = new StringBuffer(in.nextLine());
        int i=0;
        while(i<s.length()){
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                s.deleteCharAt(i+1);
            }else{
                i++;
            }
        }
        System.out.println(s);
    }
}
