package Stack;
import java.util.*;

public class SortAStack {
    public void sortedInsert(Stack<Integer> s,int ele){
        if(s.empty() || s.peek()<ele){
            s.push(ele);
            return;
        }

        int num=s.pop();

        sortedInsert(s,ele);

        s.push(num);

    }
    public void srt(Stack<Integer> s){
        if(s.empty()){
            return;
        }

        int ele = s.pop();

        srt(s);

        sortedInsert(s,ele);
    }
    public Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.
        srt(s);
        return s;
    }
}
