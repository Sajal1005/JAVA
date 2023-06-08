package Stack;
import java.util.*;

public class Balanced_Parenthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String s = in.next();
        for(int i=0;i<s.length();i++){
            if(st.empty()){
                st.push(s.charAt(i));
            }else if(st.peek()=='(' && s.charAt(i)==')'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        System.out.println(st.size());
    }
}
