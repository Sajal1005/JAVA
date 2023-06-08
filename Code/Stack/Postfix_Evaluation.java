package Stack;
import java.util.*;

public class Postfix_Evaluation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                st.push((int)s.charAt(i));
            }else{
                int op1 = st.pop();
                int op2 = st.pop();
                if(s.charAt(i)=='+'){
                    st.push(op1+op2);
                }else if(s.charAt(i)=='-'){
                    st.push(op2-op1);
                }else if(s.charAt(i)=='*'){
                    st.push(op1*op2);
                }else{
                    st.push(op2/op1);
                }
            }
            System.out.println(st);
        }
        System.out.println(st.pop());
    }
}
