package Stack;
import java.util.*;

public class InfixToPostfix {
    public static int prec(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }
    public static String infixToPostfix(String s) {
        // Your code here
        String res="";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res+=c;
            }else if(c=='('){
                stack.push(c);
            }else if(c==')'){
                while(stack.peek()!='('){
                    res+=(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.empty() && prec(stack.peek())>=prec(c)){
                    res+=(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.empty()){
            res+=(stack.pop());
        }
        return res;
    }
}
