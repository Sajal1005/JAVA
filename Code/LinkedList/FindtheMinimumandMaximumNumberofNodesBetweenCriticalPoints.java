package LinkedList;
import java.util.*;

public class FindtheMinimumandMaximumNumberofNodesBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ListNode temp = head;
        int count=2;
        ArrayList<Integer> critical = new ArrayList<>();
        while(temp!=null && temp.next!=null && temp.next.next!=null){
            if((temp.next.val>temp.val && temp.next.val>temp.next.next.val)||(temp.next.val<temp.val && temp.next.val<temp.next.next.val)){
                critical.add(count);
            }
            count++;
            temp=temp.next;
        }
        System.out.println(critical);
        if(critical.size()<2){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }int min=Integer.MAX_VALUE,max=critical.get(critical.size()-1)-critical.get(0);
        for(int i=1;i<critical.size();i++){
            min=Math.min(min,(critical.get(i)-critical.get(i-1)));
        }
        ans[0]=min;
        ans[1]=max;
        return ans;
    }
}
