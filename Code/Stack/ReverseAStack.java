package Stack;
import java.util.*;

public class ReverseAStack {
    static void addAtBottom(Stack<Integer> s, int x){
        if(s.empty()){
            s.push(x);
            return;
        }

        int ele = s.pop();

        addAtBottom(s,x);

        s.push(ele);
    }
    static void reverse(Stack<Integer> s)
    {
        if(s.empty()){
            return;
        }

        int ele = s.pop();

        reverse(s);

        addAtBottom(s,ele);

    }
}
