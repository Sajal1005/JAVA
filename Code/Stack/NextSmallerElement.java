package Stack;
import java.util.*;

public class NextSmallerElement {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=arr.size()-1;i>=0;i--){
            int curr = arr.get(i);
            while(s.peek()>=curr){
                s.pop();
            }
            ans.add(s.peek());
            s.push(curr);
        }
        Collections.reverse(ans);
        return ans;
    }
}
