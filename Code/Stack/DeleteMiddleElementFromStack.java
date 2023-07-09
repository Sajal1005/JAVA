package Stack;
import java.util.*;

public class DeleteMiddleElementFromStack {
    public void delete(Stack<Integer> s, int count,int n){

        if(count==(n/2)){
            s.pop();
            return;
        }

        int num=s.pop();
        delete(s,count+1,n);
        s.push(num);
    }
}
