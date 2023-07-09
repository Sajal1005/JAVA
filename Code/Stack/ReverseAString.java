package Stack;
import java.util.*;

public class ReverseAString {
    public static void main(String[] args) {
        String str="name";
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        String rev="";
        while(s.size()!=0){
            rev+=(s.pop());
        }
        System.out.println(rev);
    }
}
