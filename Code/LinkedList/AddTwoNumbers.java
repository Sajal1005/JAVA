package LinkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int carry=0;
        while(l1!=null || l2!=null){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            ListNode node = new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            carry=sum/10;
        }
        if(carry>0){
            ListNode node = new ListNode(carry);
            temp.next=node;
        }
        return ans.next;
    }
}
