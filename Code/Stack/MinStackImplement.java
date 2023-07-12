package Stack;
import java.util.*;

public class MinStackImplement {
    class Pair{
        int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    class MinStack {

        Stack<Pair> s = new Stack<>();

        public MinStack() {

        }

        public void push(int val) {
            int min;
            if(s.empty()){
                min=val;
            }else{
                min=Math.min(val,s.peek().y);
            }
            s.push(new Pair(val,min));
        }

        public void pop() {
            s.pop();
        }

        public int top() {
            return s.peek().x;
        }

        public int getMin() {
            return s.peek().y;
        }
    }
}
